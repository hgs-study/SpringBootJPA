package com.example.springboot_jpa.service;

import com.example.springboot_jpa.domain.UserRepository;
import com.example.springboot_jpa.domain.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long save(UserResponseDto userResponseDto){
        return userRepository.save(userResponseDto.toEntity()).getId();
    }
}
