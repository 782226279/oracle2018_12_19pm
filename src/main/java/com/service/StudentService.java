package com.service;

import java.util.List;
import java.util.Map;

import com.pojo.Student;

//Student业务层接口
public interface StudentService {

	/**
	 * 查询所有的Student对象
	 */
	List<Student> getAllStudent();
	
	
	int insert(Student record);

}
