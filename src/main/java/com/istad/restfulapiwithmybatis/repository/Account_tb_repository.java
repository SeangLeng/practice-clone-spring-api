package com.istad.restfulapiwithmybatis.repository;

import com.istad.restfulapiwithmybatis.model.AccountDB;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Account_tb_repository {

    @Result(column = "account_type", property = "account_type",
            one = @One(select = "com.istad.restfulapiwithmybatis.repository.getAllAccountType")
    )
    @Select("SELECT * FROM account_tb")
    List<AccountDB> getAllAccounts();
}
