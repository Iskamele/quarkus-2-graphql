package com.example.models;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private String firstName;
    private String lastName;
    private int idNumber;
    private int age;
}
