package com.duiduidui.service;

import com.duiduidui.dao.LoginDao;
import com.duiduidui.entity.JsonResult;
import com.duiduidui.entity.Student;
import com.duiduidui.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AZERO on 2018/4/8
 */
@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;

    public JsonResult studentLogin(String student_account,String pwd){
        System.out.println(student_account);
        Student student =loginDao.getStudentByAccount(student_account);
        System.out.println(student.getStudent_pwd());
//        System.out.println(studentLogin.toString());
        if (student!=null){
            System.out.println(student.toString());
            System.out.println(student.getStudent_birthday());
        }
        if (student ==null){
            return new JsonResult("不存在此用户",false);
        }else if(!student.getStudent_pwd().equals(pwd)){
            return new JsonResult("密码错误",false);
        }
        return new JsonResult("登录成功",true, student);
    }

    public JsonResult teacherLogin(String teacher_account,String teacher_pwd){
        System.out.println(teacher_account);
        Teacher teacher =loginDao.getTeacherByAccount(teacher_account);
        System.out.println(teacher.getTeacher_pwd());
        if (teacher!=null){
            System.out.println(teacher.toString());
            System.out.println(teacher.getTeacher_birthday());
        }
        if (teacher ==null){
            return new JsonResult("不存在此用户",false);
        }else if(!teacher.getTeacher_pwd().equals(teacher_pwd)){
            return new JsonResult("密码错误",false);
        }
        return new JsonResult("登录成功",true, teacher);
    }

}
