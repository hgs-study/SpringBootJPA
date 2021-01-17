package com.example.springboot_jpa.web.HTTPMethodTest;

import com.example.springboot_jpa.domain.UserResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpMethodController {

    //회원 목록 get (/members)
    //회원 등록 post (/members)
    //회원 조회 get (/members/{id})
    //회원 수정 patch,put,post (/members/{id})
    //회원 삭제 delete (/members/{id})

    //주로 정렬 필터(검색어) - 쿼리 파라미터 전송
    //getMethod
    @GetMapping("/getMethod")
    public UserResponseDto getMethod(@RequestParam String name, @RequestParam int age){
        return UserResponseDto.builder().name(name).age(age).build();
    }

    //데이터 조회
    @GetMapping("/get")
    public String get(){
        return "get";
    }


    @GetMapping("/getMethodBuilderTest")
    public UserResponseDto getMethodBuilderTest(@RequestParam String name){
        return UserResponseDto.builder().name(name).build();
    }



}
