package com.ems.myapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ems.myapp2.entity.Student;
import com.ems.myapp2.repository.StudentRegistrationRepository;

@SpringBootApplication
public class StudentRegistration {
     

     
	public static void main(String[] args) {
		SpringApplication.run(StudentRegistration.class, args);
	}


	
	

	/*
	 * @Override public void run(ApplicationArguments args) throws Exception { //
	 * TODO Auto-generated method stub
	 * System.out.println(Arrays.asList(args.getSourceArgs())); }
	 */
	/*
	 * @Override public void run(ApplicationArguments args) throws Exception { //
	 * TODO Auto-generated method stub System.out.println(args.getSourceArgs()); }
	 */

	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub System.out.println(args[0]); }
	 */

}
