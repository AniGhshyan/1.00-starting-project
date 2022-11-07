package com.example.testpostgressql.service;


import com.example.testpostgressql.entity.Student;
import com.example.testpostgressql.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student createStudent(Student student) {

        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
