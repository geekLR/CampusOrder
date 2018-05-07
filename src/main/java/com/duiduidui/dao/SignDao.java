package com.duiduidui.dao;

import com.duiduidui.entity.Student;
import com.duiduidui.entity.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper  //扫描接口 可以操作数据库----实现数据库和实体类的映射关系
public interface SignDao {
    //学生注册时插入数据库
    @Select("select * from student where student_account=#{student_account,jdbcType=VARCHAR}")//相当于相等
    public Student isExistStudent(String student_account);
    @Insert("insert into student(student_account,student_pwd) values(#{student_account},#{student_pwd})")
    public void addStudent(Student student);//插入的是这个元素   //参数是前端返回的，返回之后给数据库

    //老师注册时查找数据库插入数据库
    @Select("select * from teacher where teacher_account=#{teacher_account,jdbcType=VARCHAR}")
    public Teacher isExistTeacher(String teacher_account);
    @Insert("insert into teacher(teacher_account,teacher_pwd) values(#{teacher.teacher_account},#{teacher.teacher_pwd})")
    public void addTeacher(@Param("teacher") Teacher teacher);//插入的是这个元素   //参数是前端返回的，返回之后给数据库
}
//json是用前端进行开发的