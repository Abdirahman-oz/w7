package com.abdirahman.w7.repository;
import com.abdirahman.w7.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository <Student, Long>{

}
