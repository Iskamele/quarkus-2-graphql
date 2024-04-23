package com.example.models;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private String name;
    private int accountNumber;
    private Client client;
    private BigDecimal balance;
}
