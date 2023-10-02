package awadh.bakery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class manageController {


    @GetMapping("/")
    public String redirectToManage() {
        return "manage-page";
    }

    
    

    
}
