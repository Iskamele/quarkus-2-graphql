package com.example.repositories;

import com.example.models.Account;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class AccountRepository implements PanacheRepository<Account> {

    public Optional<Account> findByAccountNumber(int accountNumber) {
        return find("accountNumber", accountNumber).firstResultOptional();
    }
}
