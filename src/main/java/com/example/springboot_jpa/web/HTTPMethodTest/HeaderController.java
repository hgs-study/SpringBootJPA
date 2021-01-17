package com.example.springboot_jpa.web.HTTPMethodTest;


import com.example.springboot_jpa.domain.UserResponseDto;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HeaderController {

    @GetMapping("/HeaderTest")
    public String getMethodBuilderTest(@RequestParam String name, HttpServletResponse response){

        HttpHeaders headers= new HttpHeaders();
        headers.set("HeaderName",name);

        response.addHeader("addHeaderName",name);

        return "HTTPTest/HeaderTest";
    }

//    @GetMapping("/HeaderTest")
//    public UserResponseDto getMethodBuilderTest(@RequestParam String name){
//
////        HttpHeaders headers= new HttpHeaders();
////        headers.set("name",name);
//
//        return UserResponseDto.builder().name(name).build();
//    }
}
