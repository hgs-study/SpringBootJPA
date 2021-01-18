package com.example.springboot_jpa.web.DTOTest;

import com.example.springboot_jpa.domain.ProductResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DTOTestController {

    //@RequestBody는 무조건 post로 !!!!
    @PostMapping("/productDTOTest")
    public ProductResponseDto productResponseDto(@RequestBody ProductResponseDto productResponseDto){
        return ProductResponseDto.builder().name(productResponseDto.getName()).amount(productResponseDto.getAmount()).manufacturer(productResponseDto.getManufacturer()).build();
    }
}
