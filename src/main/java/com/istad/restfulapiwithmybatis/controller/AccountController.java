package com.istad.restfulapiwithmybatis.controller;

import com.istad.restfulapiwithmybatis.mapper.AutoAccountMapper;
import com.istad.restfulapiwithmybatis.model.AccountDB;
import com.istad.restfulapiwithmybatis.model.responeData.ResponseAccountData;
import com.istad.restfulapiwithmybatis.service.Account_tb_service;
import com.istad.restfulapiwithmybatis.util.Response_util;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user-account")
public class AccountController {
    Account_tb_service accountTbService;
    AutoAccountMapper autoAccountMapper;
    AccountController(Account_tb_service accountTbService, AutoAccountMapper autoAccountMapper){
        this.accountTbService = accountTbService;
        this.autoAccountMapper = autoAccountMapper;
    }

    @GetMapping("/all-user-account")
    Response_util<List<ResponseAccountData>> getAllAccountDB(){
        try{
            List<AccountDB> allAccount = accountTbService.getAllAccounts();
            List<ResponseAccountData> accountResponse = autoAccountMapper.mapToAccountResponse(allAccount);
            return  Response_util.<List<ResponseAccountData>>ok()
                    .setPayload(accountResponse).setMessage("Founded! all the user");
        }catch (Exception e){
            return Response_util.<List<ResponseAccountData>>exception().setMessage("Data not found!")
                    .setSuccess(false);
        }
    }
}
