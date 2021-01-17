package com.example.springboot_jpa.web.HTTPMethodTest;


import com.example.springboot_jpa.domain.UserResponseDto;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HeaderController {

    @GetMapping("/HeaderTest")
    public String getMethodBuilderTest(){

        return "HTTPTest/HeaderTest";
    }

    @ResponseBody
    @GetMapping("/setHeaderTest")
    public String setHeaderTest(HttpServletResponse response){


        response.setHeader("addHeaderName","setHeaderTest");

        return "response에 setHeaderTest 전달하기";
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
