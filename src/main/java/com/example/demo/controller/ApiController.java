package com.example.demo.controller;


import com.example.demo.domain.Clothes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/clothes")
    @ResponseBody
    public Clothes testClothes(){
        return new Clothes("심기성","츄리닝","상의","파란색","http://simqizzang.tistory.com",1000000);
    }

}
