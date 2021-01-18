package com.example.springboot_jpa.web.api;

import com.example.springboot_jpa.domain.UserResponseDto;
import com.example.springboot_jpa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ApiController {

    private final UserService userService;

    @PostMapping("/api/v1/users")
    public Long save(UserResponseDto userResponseDto){
        return userService.save(userResponseDto);
    }
}
