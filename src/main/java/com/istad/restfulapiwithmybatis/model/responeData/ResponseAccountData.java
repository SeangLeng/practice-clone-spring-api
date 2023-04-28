package com.istad.restfulapiwithmybatis.model.responeData;

import com.istad.restfulapiwithmybatis.model.Accounttypes_tb;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAccountData {
    private int id;
    private String account_no;
    private String account_name;
    private String profile;
    private String phone_number;
    private String transfer_limit;
    private Accounttypes_tb account_type;
}
