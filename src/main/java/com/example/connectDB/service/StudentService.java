package com.example.connectDB.service;

import com.example.connectDB.entity.Student;
import com.example.connectDB.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    @Autowired
    private  StudentRepository repository;




    public Integer saveStudent(Student student)
    {
        return repository.save(student).getStdId();
    }

    public List<Student> getAllStudent()
    {
        return (List<Student>) repository.findAll();
    }

    public Student getStudentById(Integer stdNum)
    {
        return repository.findById(stdNum).get();
    }

    public void deleteStudent(Integer stdNum)
    {
        repository.deleteById(stdNum);
    }
}
