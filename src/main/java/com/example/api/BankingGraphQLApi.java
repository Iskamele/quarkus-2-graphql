package com.example.api;

import com.example.dtos.AccountDTO;
import com.example.services.AccountService;
import jakarta.inject.Inject;
import java.util.List;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class BankingGraphQLApi {

    // https://download.eclipse.org/microprofile/microprofile-graphql-1.0/microprofile-graphql.html

    @Inject
    AccountService accountService;

    @Query("allAccounts")
    public List<AccountDTO> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @Query("account")
    public AccountDTO getAccountByNumber(int accountNumber) {
        return accountService.getAccountByNumber(accountNumber);
    }

    @Mutation
    public AccountDTO createAccount(AccountDTO accountDTO) {
        return accountService.createOrUpdateAccount(accountDTO);
    }

    @Mutation
    public AccountDTO updateAccount(AccountDTO accountDTO) {
        return accountService.createOrUpdateAccount(accountDTO);
    }
}
