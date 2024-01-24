package com.example.Myfirstproject.dto;

import com.example.Myfirstproject.entity.Coffee;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class CoffeeDto {
    private Long id;
    private String name;
    private String price;

    public Coffee ToEntity() {
        return new Coffee(id, name, price);
    }
}
