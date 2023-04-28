package com.istad.restfulapiwithmybatis.mapper;

import com.istad.restfulapiwithmybatis.model.AccountDB;
import com.istad.restfulapiwithmybatis.model.Accounttypes_tb;
import com.istad.restfulapiwithmybatis.model.responeData.ResponseAccountData;

import java.util.List;

public interface AutoAccountMapper {
    // map account to request
    List<ResponseAccountData> mapToAccountResponse(List<AccountDB> account);

    // map request to account --- anytime


}
