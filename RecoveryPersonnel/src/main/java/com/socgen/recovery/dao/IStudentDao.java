package com.socgen.recovery.dao;

import java.util.List;

import com.socgen.recovery.resource.data.Student;

public interface IStudentDao {

	Student getStudentByName(String name);

	/**
	 * 
	 * @param name
	 * @return
	 */
	Student getStudentById(Integer id);

	/**
	 * 
	 * @param student
	 * @return Student.toString
	 */
	String createStudent(Student student);

	/**
	 * 
	 * @return List<Student>
	 */
	List<Student> getStudentList();

	/**
	 * 
	 * @return Student[]
	 */
	Student[] getStudentArray();
	
}
