package com.istad.restfulapiwithmybatis.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class AccountDB {
    private int id;
    private String account_no;
    private String account_name;
    private String profile;
    private int pin;
    private String passcode;
    private String phone_number;
    private String transfer_limit;
    private Accounttypes_tb account_type;

}
