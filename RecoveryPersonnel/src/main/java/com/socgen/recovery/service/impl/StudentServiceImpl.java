package com.socgen.recovery.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.socgen.recovery.dao.IStudentDao;
import com.socgen.recovery.resource.data.Student;
import com.socgen.recovery.service.IStudentService;

@Singleton
public class StudentServiceImpl implements IStudentService {

//	@Inject
//    private IStudentDao studentDao;
//
//	
//	@Override
//	public Student getStudentByName(String name) {
//		Student std = studentDao.getStudentByName(name);
//		
//		return new Student(std.getId(),std.getFirstName(),std.getLastName(),std.getEmail(),std.getLoginAD(),std.getCountry());
//		// TODO Auto-generated method stub
////		StudentEntity entity = studentDao.getStudentByName(name);
////
////        return new Student(entity.getId(), entity.getFirstName(),
////                                        entity.getLastName(), entity.getEmail(), entity.getLoginAD(),
////                                        entity.getCountry());
//
//	}
//
//	@Override
//	public Student getStudentById(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String createStudent(Student student) {
//		// TODO Auto-generated method stub
//		return studentDao.createStudent(student);
//	}
//
//	@Override
//	public List<Student> getStudentList() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Student[] getStudentArray() {
//		// TODO Auto-generated method stub
//        List<Student> studentList = getStudentList();
//        return studentList.toArray(new Student[studentList.size()]);
//
//	}


//@Inject
//private IStudentDao studentDao;
	@Override
	public Student getStudentByName(String name) {
		
		return new Student(1234, name, name, name + ".kumar@sochgen.com", name
				+ ".kumar", "IND");

	}

	@Override
	public Student getStudentById(Integer id) {
		return new Student(id, "Amit", "Agarwal",
				"amit.agarwal2@cognizant.com", "amit.Agarwal", "IND");
	}

	@Override
	public String createStudent(Student student) {
		return student.toString();
	}

	@Override
	public List<Student> getStudentList() {
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
        List<Student> studentList = getStudentList();
        return studentList.toArray(new Student[studentList.size()]);
	}

	
	
	
	
}
