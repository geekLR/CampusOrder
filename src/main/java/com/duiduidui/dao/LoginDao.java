package com.duiduidui.dao;

import com.duiduidui.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by AZERO on 2018/4/10
 */
@Mapper
public interface LoginDao {

    @Select("select * from student WHERE name = #{name,jdbcType=VARCHAR}")
    Student getStudentByName(String name);
}
