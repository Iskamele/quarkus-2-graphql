package com.example.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClientDTO {
    private String firstName;
    private String lastName;
    private int idNumber;
    private int age;
}