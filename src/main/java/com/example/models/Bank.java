package com.example.models;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bank {
    private String name;
    private String bankCode;
    private List<Account> accounts;
}

