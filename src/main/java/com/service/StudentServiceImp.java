package com.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.StudentMapper;
import com.pojo.Student;

//Student业务层接口实现类
//@Service 等价于spring里面的 <bean id="studentServiceImp" class="com.service.StudentServiceImp"></bean>
@Service
public class StudentServiceImp implements StudentService {

	// 注入属性的值
	@Resource(name = "studentMapper")
	StudentMapper studentMapper;// dao层的接口

	@Override
	public List<Student> getAllStudent() {
		// 调用dao层获取数据
		return studentMapper.getAllStudent();
	}

	@Override
	public int insert(Student record) {
		// 调用dao层获取数据
		return studentMapper.insert(record);
	}

}
