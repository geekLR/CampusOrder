package com.duiduidui.service;

import com.duiduidui.dao.LoginDao;
import com.duiduidui.entity.JsonResult;
import com.duiduidui.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AZERO on 2018/4/8
 */
@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;

    public JsonResult login(String name,String pwd){
        Student student=loginDao.getStudentByName(name);
        if (student==null){
            return new JsonResult("不存在此用户",false);
        }else if(!student.getPwd().equals(pwd)){
            return new JsonResult("密码错误",false);
        }
        return new JsonResult("登录成功",true,student);
    }

}
