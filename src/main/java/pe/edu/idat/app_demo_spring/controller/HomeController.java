package pe.edu.idat.app_demo_spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/inicio")
    public String home(){
        return "home";
    }
}
