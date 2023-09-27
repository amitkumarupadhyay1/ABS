package awadh.bakery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import awadh.bakery.models.*;
import org.springframework.ui.Model;

@Controller
public class productController {

    private final productRepository productRepository;

    @Autowired
    public productController(productRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products/list")
    public String getAllProducts(Model model) {
        // Retrieve the list of products from the repository
        List<product> products = productRepository.findAll();
        model.addAttribute("products",products);
        return "product/product-list";
    }
}
