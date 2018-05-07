package com.duiduidui.controller;

import com.duiduidui.entity.JsonResult;
import com.duiduidui.entity.Student;
import com.duiduidui.entity.Teacher;
import com.duiduidui.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin //前后端的跨域请求
public class SignController {
    @Autowired
    public SignService signService;

    @RequestMapping("/studentSign")
    JsonResult studentSign(@RequestBody Student student){//由于是JSon字符串 参数必须用requestbody和post方式
        return signService.studentSign(student);
    }
    @RequestMapping("/teacherSign")
    JsonResult teacherSign(@RequestBody Teacher teacher){//自动包装成实体类
        return signService.teacherSign(teacher);
    }
}
