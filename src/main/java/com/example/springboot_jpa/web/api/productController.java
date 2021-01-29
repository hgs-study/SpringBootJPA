package com.example.springboot_jpa.web.api;

import com.example.springboot_jpa.domain.product.productDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class productController {

    @PostMapping(value = "/validAnnotationTest")
    public ResponseEntity<?> validTest(@RequestBody @Valid productDTO productDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bindingResult.getAllErrors());
        }
        return ResponseEntity.status(HttpStatus.OK).body("hgstudy_validAnntationTest ok 200");
    }
}
