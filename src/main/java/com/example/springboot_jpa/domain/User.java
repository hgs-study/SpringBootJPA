//package com.example.springboot_jpa.domain;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Entity
//public class User {
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    private Long id;
//
//    @Column( nullable = false)
//    private String name;
//
//    @Column( nullable = false)
//    private int age;
//
//    public User update(Long id, String name, int age){
//        this.id = id;
//        this.name = name;
//        this.age = age;
//
//        return this;
//    }
//
//}
