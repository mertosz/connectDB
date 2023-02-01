package com.example.connectDB.controller;

import com.example.connectDB.entity.Student;
import com.example.connectDB.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentDetails")
public class StudentAPI {

    @Autowired
    private  StudentService service;

    @GetMapping("/test")
    public String testto()
    {
        return "tests";
    }
    @PostMapping("/saveStudent")
    public ResponseEntity<String> saveStudent(@RequestBody Student student)
    {
        Integer id = service.saveStudent(student);
        return new ResponseEntity<String>("Student" + id + "saved",HttpStatus.OK);
    }

    @GetMapping("/getStudent")
    public ResponseEntity<List<Student>> getAllStudentDetail()
    {
        List<Student> list = service.getAllStudent();
        return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
    }

    @GetMapping("/getStudentById/{stdId}")
    public ResponseEntity<Student> getStudentByID(@PathVariable("stdId") Integer stdId)
    {
        Student std = service.getStudentById(stdId);
        return new ResponseEntity<>(std,HttpStatus.OK);
    }


}
