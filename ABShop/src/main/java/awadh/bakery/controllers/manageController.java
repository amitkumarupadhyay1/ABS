package awadh.bakery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class manageController {


    @GetMapping("/")
    public String redirectToManage() {
        return "redirect:/manage/orders";
    }

    @GetMapping("/manage/orders")
    public String redirectToOrderList() {
        return "redirect:/orders/list";
    }

    @GetMapping("/manage/products")
    public String redirectToProductList() {
        return "redirect:/products/list";
    }

    @GetMapping("/manage/customers")
    public String redirectToCustomerList() {
        return "redirect:/customers/list";
    }
}
