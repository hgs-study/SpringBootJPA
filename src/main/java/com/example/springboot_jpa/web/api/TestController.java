package com.example.springboot_jpa.web.api;

import com.example.springboot_jpa.domain.UserResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String hello(){
        return "hello";
    }

    @GetMapping("/DTOTest")
    public UserResponseDto userResponseDto(){
        return UserResponseDto.builder().name("현건수").age(13).build();
    }
}
