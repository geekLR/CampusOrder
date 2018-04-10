package com.duiduidui.controller;

import com.duiduidui.entity.JsonResult;
import com.duiduidui.entity.Student;
import com.duiduidui.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/login")
    JsonResult login(@RequestBody Student student){
        return loginService.login(student.getName(),student.getPwd());
    }
}
