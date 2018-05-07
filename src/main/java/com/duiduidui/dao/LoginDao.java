package com.duiduidui.dao;

import com.duiduidui.entity.Student;
import com.duiduidui.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by AZERO on 2018/4/10
 */
@Mapper
public interface LoginDao {

    @Select("select * from student WHERE student_account = #{student_account,jdbcType=VARCHAR}")
    Student getStudentByAccount(String student_account);

    @Select("select * from teacher WHERE teacher_account = #{teacher_account,jdbcType=VARCHAR}")
    Teacher getTeacherByAccount(String teacher_account);
}
