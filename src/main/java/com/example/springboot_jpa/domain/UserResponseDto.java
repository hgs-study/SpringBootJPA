package com.example.springboot_jpa.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserResponseDto {
    private String name;

    private int age;

    @Builder
    public UserResponseDto(String name, int age){
        this.name = name;
        this.age = age;
    }

    public User toEntity(){
        return User.builder().name(name).age(age).build();
    }
}
