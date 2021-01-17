package com.example.springboot_jpa.web.HTTPMethodTest;


import com.example.springboot_jpa.domain.UserResponseDto;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

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

    @ResponseBody
    @PostMapping("/getHeaderTest")
    public String getHeaderTest(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String,Object> body){

        System.out.printf("request.getHeader(\"getHeader\") :"+request.getHeader("getHeader"));
        System.out.printf("request body :"+body);
        response.setHeader("setResHeader",request.getHeader("getHeader"));

        return "response에 getHeader 다시 전달하기 =>"+request.getHeader("getHeader");
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
