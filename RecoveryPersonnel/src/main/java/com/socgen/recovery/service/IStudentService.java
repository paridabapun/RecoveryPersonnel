package com.socgen.recovery.service;

import java.util.List;

import com.socgen.recovery.resource.data.Student;

public interface IStudentService {
	/**
	 * 
	 * @param name
	 * @return Student
	 */
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
