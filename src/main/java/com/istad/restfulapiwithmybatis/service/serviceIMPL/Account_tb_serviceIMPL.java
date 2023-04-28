package com.istad.restfulapiwithmybatis.service.serviceIMPL;

import com.istad.restfulapiwithmybatis.model.AccountDB;
import com.istad.restfulapiwithmybatis.repository.Account_tb_repository;
import com.istad.restfulapiwithmybatis.service.Account_tb_service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Account_tb_serviceIMPL implements Account_tb_service {

    Account_tb_repository accountTbRepository;
    Account_tb_serviceIMPL(Account_tb_repository accountTbRepository){
        this.accountTbRepository = accountTbRepository;
    }
    @Override
    public List<AccountDB> getAllAccounts() {
        return accountTbRepository.getAllAccounts();
    }
}
