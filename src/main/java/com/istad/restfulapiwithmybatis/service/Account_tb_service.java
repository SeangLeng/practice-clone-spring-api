package com.istad.restfulapiwithmybatis.service;

import com.istad.restfulapiwithmybatis.model.AccountDB;

import java.util.List;

public interface Account_tb_service {
    List<AccountDB> getAllAccounts();
}
