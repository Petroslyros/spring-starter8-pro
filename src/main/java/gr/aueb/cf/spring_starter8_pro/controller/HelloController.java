package gr.aueb.cf.spring_starter8_pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/starter")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("message","Hello Coding");
        return "index";
    }
}
