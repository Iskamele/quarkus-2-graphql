package com.example.dtos;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountDTO {
    private String name;
    private int accountNumber;
    private BigDecimal balance;
    private ClientDTO client;
}
