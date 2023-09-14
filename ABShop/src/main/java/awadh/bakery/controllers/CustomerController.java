package awadh.bakery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import awadh.bakery.models.Customer;
import awadh.bakery.models.CustomerRepository;


@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping("/")
    public String redirectToCustomerList() {
        return "redirect:/customers/list";
    }
    
    @GetMapping("/customers/list")
    public String ListCustomer(Model model) {
    	List<Customer> customers=customerRepository.findAll();
    	model.addAttribute("customers",customers);
    	return "customer-list";
    }

    @GetMapping("/customer/form")
    public String showCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
    	if (customer.getCustID()==0) {
            
            customerRepository.save(customer);
        } else {
            Customer existingCustomer = customerRepository.findById(customer.getCustID())
                .orElseThrow(() -> new IllegalArgumentException("Invalid customer ID: " + customer.getCustID()));
            existingCustomer.setName(customer.getName());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setPhone(customer.getPhone());
            existingCustomer.setAddress(customer.getAddress());
            customerRepository.save(existingCustomer);
        }
        return "redirect:/customers/list";
    }
    
    @GetMapping("/customer/edit/{id}")
    public String showEditCustomerForm(@PathVariable("id") int id, Model model) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid customer ID: " + id));
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @GetMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable("id") int id) {
        customerRepository.deleteById(id);
        return "redirect:/customers/list";
    }

}
