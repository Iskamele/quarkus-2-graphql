package com.example.services;

import com.example.dtos.AccountDTO;
import com.example.exceptions.AccountNotFoundException;
import com.example.mappers.AccountMapper;
import com.example.models.Account;
import com.example.repositories.AccountRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class AccountService {

    @Inject
    AccountRepository accountRepository;

    public List<AccountDTO> getAllAccounts() {
        return accountRepository.findAll().list().stream()
                .map(AccountMapper.INSTANCE::accountToAccountDTO)
                .collect(Collectors.toList());
    }

    public AccountDTO getAccountByNumber(int accountNumber) {
        Account account = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new AccountNotFoundException("Account not found with number: " + accountNumber));
        return AccountMapper.INSTANCE.accountToAccountDTO(account);
    }

    public AccountDTO createOrUpdateAccount(AccountDTO accountDTO) {
        Account account = accountRepository.findByAccountNumber(accountDTO.getAccountNumber())
                .orElse(new Account());
        account.setName(accountDTO.getName());
        account.setAccountNumber(accountDTO.getAccountNumber());
        account.setBalance(accountDTO.getBalance());
        accountRepository.persist(account);
        return AccountMapper.INSTANCE.accountToAccountDTO(account);
    }
}
