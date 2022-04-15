package com.ems.myapp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.myapp2.entity.Student;
import com.ems.myapp2.repository.StudentRegistrationRepository;

@Service
public class StudentService {
	@Autowired
	StudentRegistrationRepository srepo;
     
	public Student saveStudent(Student student) {
		return srepo.save(student);
	}
	public List<Student> getAllStudent(){
		return srepo.findAll();
	}
	public String deleteStudent(int id) {
		srepo.deleteById(id);
		return "SUCCESS";
	}
	public String deleteAllStudents() {
		srepo.deleteAll();;
		return "SUCCESSFULLLLL";
	}
	
	}
