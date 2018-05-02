package com.socgen.recovery.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.socgen.recovery.dao.IStudentDao;
import com.socgen.recovery.resource.data.Student;

public class StudentDaoImpl implements IStudentDao{

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return new Student(1234, name, name, name + ".kumar@sochgen.com", name
				+ ".kumar", "IND");
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return new Student(id, "Amit", "Agarwal",
				"amit.agarwal2@cognizant.com", "amit.Agarwal", "IND");
	}

	@Override
	public String createStudent(Student student) {
		// TODO Auto-generated method stub
		return student.toString();
	}

	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		Student obj1 = new Student(111, "Amit", "Agarwal",
				"amit.agarwal2@cognizant.com", "amit.Agarwal", "IND");
		Student obj2 = new Student(222, "Amit", "Agarwal",
				"amit.agarwal2@cognizant.com", "amit.Agarwal", "IND");
		list.add(obj1);
		list.add(obj2);
		return list;
	}

	@Override
	public Student[] getStudentArray() {
		// TODO Auto-generated method stub
		List<Student> studentList = getStudentList();
        return studentList.toArray(new Student[studentList.size()]);
	}

}
