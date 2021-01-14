package com.example.springboot_jpa.web;

import com.example.springboot_jpa.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {


    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/loginPage")
    public String login(Model model){

        User user = User.builder()
                    .name("현건수")
                    .age(13)
                    .build();
        model.addAttribute("User",user);

        return "login";
    }
}
