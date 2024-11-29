package com.abdirahman.w7.Controller;

import com.abdirahman.w7.entity.Student;
import com.abdirahman.w7.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return  studentService.getALLStudents();
    }

    @GetMapping("/{id}")
    public Student getOneStudent(@PathVariable long id){
        return  studentService.getOneStudent(id);
    }

    @PutMapping ("/{id}")
    public Student updateStudent(@PathVariable long id,Student student){
        return studentService.updateStudent(id,student);
    }


    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return  studentService.savePerson(student);
    }

    @DeleteMapping("/{id}")
    public void deleteOneStudent(@PathVariable long id){
         studentService.deleteStudent(id);

    }




}
