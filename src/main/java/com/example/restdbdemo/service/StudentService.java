package com.example.restdbdemo.service;

import com.example.restdbdemo.data.Student;
import com.example.restdbdemo.data.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id){
        Optional<Student> stdObj=studentRepository.findById(id);    //  id can either exist or not
        if(stdObj.isPresent()){
            return stdObj.get();
        }
        return null;
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
}
