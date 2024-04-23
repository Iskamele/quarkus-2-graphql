package com.example.mappers;

import com.example.dtos.AccountDTO;
import com.example.models.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(source = "client", target = "client")
    AccountDTO accountToAccountDTO(Account account);

//    @Mapping(source = "client", target = "client")
//    Account accountDTOToAccount(AccountDTO accountDTO);
}
