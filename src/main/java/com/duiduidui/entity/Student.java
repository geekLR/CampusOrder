package com.duiduidui.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * Created by AZERO on 2018/4/8
 */
@Data
public class Student {
    @NotEmpty(message="用户名不能为空")
    private String student_account;
    @NotEmpty(message="密码不能为空")
    private String student_pwd;
    private String student_id;
    private String student_name;
    private String student_class;
    private String student_professional;
    private String student_sex;
    private Date student_birthday;
    private String student_address;
    private int student_age;
}
