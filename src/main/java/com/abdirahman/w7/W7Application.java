package com.abdirahman.w7;

import com.abdirahman.w7.entity.Student;
import com.abdirahman.w7.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class W7Application {

	public static void main(String[] args) {
		SpringApplication.run(W7Application.class, args);

//		// Start the Spring Boot application context
//		ApplicationContext context = SpringApplication.run(W7Application.class, args);
//
//		// Get the PersonService bean
//		StudentService studentService = context.getBean(StudentService.class);
//
//		// 1. Add new persons
//		Student student1 = new Student();
//		student1.setName("John Doe");
//		student1.setAge(21);
//		student1.setEmail("john.doe@example.com");
//		Student savedPerson1 = studentService.savePerson(student1);
//		System.out.println("Added Student: " + savedPerson1);
//
//		Student student2 = new Student();
//		student2.setName("Jane Smith");
//		student2.setAge(25);
//		student2.setEmail("jane.smith@example.com");
//		Student savedPerson2 = studentService.savePerson(student2);
//		System.out.println("Added Person: " + savedPerson2);
//
//		// 2. Retrieve and print all persons
//		System.out.println("All Persons: " + studentService.getALLStudents());
//
//		// 3. Update a person
//		Student updateStudent = new Student();
//		updateStudent.setName("John Updated");
//		updateStudent.setAge(15);
//		updateStudent.setEmail("john.updated@example.com");
//		Student updatedPerson = studentService.updateStudent(savedPerson1.getId(), updateStudent);
//		System.out.println("Updated Person: " + updatedPerson);
//
//		// 4. Delete a person
//		studentService.deleteStudent(savedPerson2.getId());
//		System.out.println("Deleted Person with ID: " + savedPerson2.getId());
//
//		// 5. Print all persons after deletion
//		System.out.println("All Persons after Deletion: " + studentService.getALLStudents());


	}

}
