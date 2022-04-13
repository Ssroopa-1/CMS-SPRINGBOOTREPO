package com.ems.myapp2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.myapp2.entity.Student;

@Repository
public interface StudentRegistrationRepository extends CrudRepository<Student, Integer> {
     List<Student> findAll();
}
