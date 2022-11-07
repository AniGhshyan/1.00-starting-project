package com.example.testpostgressql.repository;


import com.example.testpostgressql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
