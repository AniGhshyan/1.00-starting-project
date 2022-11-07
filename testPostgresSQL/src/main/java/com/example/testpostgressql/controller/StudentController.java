package com.example.testpostgressql.controller;

import com.example.testpostgressql.entity.Student;
import com.example.testpostgressql.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/saveStudent")
    public List<Student> getStudent(){

        return studentService.findAll();
    }

    @PostMapping("/saveStudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return ResponseEntity.ok(student);
    }

}
