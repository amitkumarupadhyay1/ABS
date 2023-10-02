package awadh.bakery.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import awadh.bakery.models.order;
import awadh.bakery.models.orderRepository; // Assuming you have an Order entity and repository

@Controller
public class orderController {

    @Autowired
    private orderRepository orderRepository;

    @GetMapping("/orders/list")
    public String listOrders(Model model) {
        List<order> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "order-list";
    }

    @GetMapping("/order/form")
    public String showOrderForm(Model model) {
        model.addAttribute("order", new order());
        return "order-form";
    }

    @PostMapping("/saveOrder")
    public String saveOrder(@ModelAttribute("order") order order, BindingResult bindingResult,
                            @RequestParam("imageFile") MultipartFile imageFile, RedirectAttributes redirectAttributes) throws IOException {

        if (bindingResult.hasErrors()) {
            // Validation errors occurred, return to the form page
            return "order-form";
        }

        // Validate the image size here
        if (!imageFile.isEmpty() && imageFile.getSize() > 2048 * 1024) {
            bindingResult.rejectValue("imageFile", "image.size", "Image size exceeds the allowed limit");
            return "order-form";
        }
        // Check if the file's content type is one of the allowed image types
        String contentType = imageFile.getContentType();
        if (!contentType.equals("image/jpeg") && !contentType.equals("image/jpg") && !contentType.equals("image/png")) {
            bindingResult.rejectValue("imageFile", "image.type", "Only JPEG and PNG files are allowed");
            return "order-form";
        }

        // Save the image to the server
        if (!imageFile.isEmpty()) {
            String uploadDirectory = "C:\\Users\\zaid khan\\Desktop\\C\\MARKET\\src\\main\\resources\\orderImages\\"; // Specify the storage location
            String originalFileName = imageFile.getOriginalFilename();
            String uniqueFileName = System.currentTimeMillis() + "_" + originalFileName;

            try {
                File file = new File(uploadDirectory, uniqueFileName);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(imageFile.getBytes());
                fileOutputStream.close();
            } catch (IOException e) {
                // Handle any IO exception
                e.printStackTrace();
                // You can return an error message or perform other error handling here
            }
            order.setImageFileName(uniqueFileName);
        }

        // Save the order data to the database
        orderRepository.save(order);

        // Redirect to the order list page
        redirectAttributes.addFlashAttribute("successMessage", "Order saved successfully");
        return "redirect:/orders/list";

    }

    @GetMapping("/order/edit/{id}")
    public String showEditOrderForm(@PathVariable("id") Long id, Model model) {
        order order = orderRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid order ID: " + id));
        model.addAttribute("order", order);
        return "update-form";
    }

    @PostMapping("/order/update")
    public String updateOrder(@ModelAttribute("order") order order) {
        orderRepository.save(order);
        return "redirect:/orders/list";
    }

    @GetMapping("/order/delete/{id}")
    public String deleteOrder(@PathVariable("id") Long id) {
        orderRepository.deleteById(id);
        return "redirect:/orders/list";
    }
}
