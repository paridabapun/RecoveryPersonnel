package com.socgen.recovery.resource.impl;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import com.socgen.recovery.resource.IStudentResource;
import com.socgen.recovery.resource.data.Student;
import com.socgen.recovery.service.IStudentService;

public class StudentResourceImpl implements IStudentResource {
	@Inject
	private IStudentService service;

	@Override
	public String testResource() {
		return "Testing Student Resource rest call";
	}

	@Override
	public Student getStudent(String name) {
		return service.getStudentByName(name);
	}

	@Override
	public Student getStudent(Integer id) {
		return service.getStudentById(id);
	}

	@Override
	public Response createStudent(Student student) {
		String output = service.createStudent(student);
		return Response.status(200).entity(output).build();
	}

	@Override
	public List<Student> getStudentDetailsList() {
		return service.getStudentList();
	}

	@Override
	public Student[] getStudentDetailsArray() {
		return service.getStudentArray();
	}

}
