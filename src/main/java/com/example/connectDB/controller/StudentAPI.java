package com.example.connectDB.controller;

import com.example.connectDB.business.StudentBusiness;
import com.example.connectDB.entity.Student;
import com.example.connectDB.exception.StudentException;
import com.example.connectDB.model.MregisterRequest;
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
    private StudentService service;

    @Autowired
    private StudentBusiness business;

    @PostMapping("/test")
    public String test(@RequestBody MregisterRequest request) {
        return "recieved " + request;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody MregisterRequest request) throws StudentException {
        String response = business.register(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/saveStudent")
    public ResponseEntity<String> saveStudent(@RequestBody Student request) {
        Integer id = service.saveStudent(request);
        return new ResponseEntity<String>("Student" + id + "saved", HttpStatus.OK);
    }

    @GetMapping("/getStudent")
    public ResponseEntity<List<Student>> getAllStudentDetail() {
        List<Student> list = service.getAllStudent();
        return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
    }

    @GetMapping("/getStudentById/{stdId}")
    public ResponseEntity<Student> getStudentByID(@PathVariable("stdId") Integer stdId) {
        Student std = service.getStudentById(stdId);
        return new ResponseEntity<>(std, HttpStatus.OK);
    }


}
