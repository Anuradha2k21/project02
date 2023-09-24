package com.example.restdbdemo.controller;

import com.example.restdbdemo.data.Student;
import com.example.restdbdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path="/students/{id}")  //  id should be same as variable parameter
    public Student getStudentById(@PathVariable int id){    //  have to put an annotation, must use same variable name
        return studentService.getStudentById(id);
    }

    @PostMapping(path = "/students")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
