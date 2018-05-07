package com.duiduidui.controller;

import com.duiduidui.entity.JsonResult;
import com.duiduidui.entity.Student;
import com.duiduidui.entity.Teacher;
import com.duiduidui.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by AZERO on 2018/4/8
 */
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    public LoginService loginService;

    @RequestMapping("/test/get")
    JsonResult index(){
        return new JsonResult("There is Test",true,"hello test");
    }

    //学生登录
    @RequestMapping("/studentLogin")
    JsonResult studentLogin(@Valid @RequestBody Student student){
        return loginService.studentLogin(student.getStudent_account(), student.getStudent_pwd());
    }

    //教师登录
    @RequestMapping("/teacherLogin")
    JsonResult teacherLogin(@RequestBody Teacher teacher){
        System.out.println("aaa");
        return loginService.teacherLogin(teacher.getTeacher_account(), teacher.getTeacher_pwd());
    }
}

