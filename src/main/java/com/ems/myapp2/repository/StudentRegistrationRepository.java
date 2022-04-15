package com.ems.myapp2.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ems.myapp2.entity.Student;

@Repository
public interface StudentRegistrationRepository extends CrudRepository<Student, Integer> {
     List<Student> findAll();
     
     
     @Transactional
     @Modifying(flushAutomatically = true)
     @Query(value= "update student s set s.email=:mal where s.id=:pal", nativeQuery = true)
     public void updateById(@Param(value="mal") String mal,@Param(value="pal") int pal); 
}
