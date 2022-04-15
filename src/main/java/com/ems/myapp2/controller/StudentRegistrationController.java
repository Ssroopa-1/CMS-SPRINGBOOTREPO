package com.ems.myapp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.myapp2.entity.Student;
import com.ems.myapp2.repository.StudentRegistrationRepository;
import com.ems.myapp2.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("api/")
public class StudentRegistrationController {
	@Autowired
	StudentRegistrationRepository srepo;

	@PostMapping("savestudent")
	public String storeData(@RequestBody Student student) {
		srepo.save(student);
		return "SUCCESSFUL";
	}

	@GetMapping("getallstudents")
	public List<Student> getAllStudent() {
		return srepo.findAll();
	}

	@PutMapping("update")
	public String updateData(@RequestBody Student student) {
		System.out.println(student.getId() +""+student.getEmail());
		srepo.updateById(student.getEmail(),student.getId());
		return "SUCCESS";
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteData(@PathVariable("id") int id) {
		
             srepo.deleteById(id);
             return id+"";
	}
	
	@DeleteMapping("deleteall")
	public String deleteAllStudents() {
	       srepo.deleteAll();
		   return "";
	}

}
