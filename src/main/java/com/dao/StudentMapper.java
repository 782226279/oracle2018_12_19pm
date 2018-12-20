package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pojo.Student;

//@Repository 等价于在spring里面的 <bean id="studentMapper" class="com.dao.StudentMapper"></bean>
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<Student> getAllStudent();
    
}