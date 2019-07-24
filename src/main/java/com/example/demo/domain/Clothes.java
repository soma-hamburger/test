package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class Clothes {
    private String owner;


    private String name;


    private String type;


    private String color;


    private String picture;


    private int price;

    public Clothes(String owner, String name, String type, String color, String picture, int price) {
        this.owner = owner;
        this.name = name;
        this.type = type;
        this.color = color;
        this.picture = picture;
        this.price = price;
    }

}
