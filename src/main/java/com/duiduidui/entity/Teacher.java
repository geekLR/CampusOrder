package com.duiduidui.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by AZERO on 2018/4/8
 */
@Data
public class Teacher {
    private String teacher_account;
    private String teacher_pwd;
    private String teacher_id;
    private String teacher_name;
    private String teacher_lever;
    private String teacher_professional;
    private String teacher_sex;
    private Date teacher_birthday;
    private int teacher_age;
    private String teacher_address;
}
