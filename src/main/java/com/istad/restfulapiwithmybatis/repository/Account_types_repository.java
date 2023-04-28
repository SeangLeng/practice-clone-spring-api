package com.istad.restfulapiwithmybatis.repository;

import com.istad.restfulapiwithmybatis.model.Accounttypes_tb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Account_types_repository {

    @Select("SELECT * FROM accounttype_tb where id = #{account_types}")
    List<Accounttypes_tb> getAllAccountType(int account_types);
}
