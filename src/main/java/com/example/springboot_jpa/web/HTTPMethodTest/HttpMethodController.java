package com.example.springboot_jpa.web.HTTPMethodTest;

import com.example.springboot_jpa.domain.UserResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpMethodController {

    //getMethod
    @GetMapping("/getMethod")
    public UserResponseDto get(@RequestParam String name, @RequestParam int age){
        return UserResponseDto.builder().name(name).age(age).build();
    }
}
