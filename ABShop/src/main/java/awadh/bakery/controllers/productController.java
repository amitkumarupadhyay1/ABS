package awadh.bakery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import awadh.bakery.models.product;
import awadh.bakery.models.productRepository;

import org.springframework.ui.Model;

@Controller
public class productController {

	@Autowired
	private productRepository productRepository;

	
}
