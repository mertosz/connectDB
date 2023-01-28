package com.example.connectDB.repository;

import com.example.connectDB.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,String >
{
     Optional<Student> saveStudent(Student student);

     List<Student> getAllStudent();

     Optional<Student> getStudentById(Integer stdNo);




}
