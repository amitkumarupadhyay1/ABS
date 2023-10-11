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
import awadh.bakery.models.orderRepository;

@Controller
public class orderController {

    @Autowired
    private orderRepository orderRepository;

    @GetMapping("/orders/list")
    public String listOrders(Model model) {
        List<order> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "/order/order-list";
    }


}
