package com.abdirahman.w7.service;

import com.abdirahman.w7.entity.Student;
import com.abdirahman.w7.repository.StudentRepository;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private  final StudentRepository studentRepository;



    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository; }

    // Get all students
    public List<Student> getALLStudents(){
        return studentRepository.findAll();
    }

    // Save a new Student
    public Student savePerson(Student person) {

        return studentRepository.save(person);
    }


    //Get one student
    public Student getOneStudent(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }



    //Update Student
    public Student updateStudent(Long id,Student updatedPerson){
        Optional<Student> optionalPerson = studentRepository.findById(id);

        if(optionalPerson.isPresent()){
            Student student = optionalPerson.get();
            student.setName(updatedPerson.getName());
            student.setAge(updatedPerson.getAge());
            student.setEmail(updatedPerson.getEmail());
            return studentRepository.save(student);
        }
        else {
            throw new RuntimeException("Student not found with ID: " + id);
        }


    }


    //Delete one student
    public void deleteStudent(Long id){
        if(studentRepository.existsById(id)){
             studentRepository.deleteById(id);
        }
        else {
            throw new RuntimeException("Student not found with ID: " + id);
        }
    }




}



