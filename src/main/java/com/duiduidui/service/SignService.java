package com.duiduidui.service;

import com.duiduidui.dao.SignDao;
import com.duiduidui.entity.JsonResult;
import com.duiduidui.entity.Student;
import com.duiduidui.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignService {
    @Autowired
    private SignDao signDao;
    //使用json返回字符串
    public JsonResult studentSign(Student s){
        Student student=signDao.isExistStudent(s.getStudent_account());//不用相等  用查找  select
        if (student==null){
            signDao.addStudent(s);
            Student student1 = signDao.isExistStudent(s.getStudent_account());
            if (student1==null){
                return new JsonResult("注册失败！",false);
            }else {
                return new JsonResult("恭喜您，注册成功！",true);
            }
        }else {
            return new JsonResult("用户名已存在，注册失败！",false);
        }
    }

    public JsonResult teacherSign(Teacher teacher){
        Teacher teacher1=signDao.isExistTeacher(teacher.getTeacher_account());
        if (teacher1==null){
            signDao.addTeacher(teacher);
            Teacher teacher2=signDao.isExistTeacher(teacher.getTeacher_account());
            if (teacher2==null){
                return new JsonResult("注册失败！",false);
            }else {
                return new JsonResult("恭喜您，注册成功！",true);
            }
        }else{
            return new JsonResult("用户名已存在，注册失败！",false);
        }
    }

}
