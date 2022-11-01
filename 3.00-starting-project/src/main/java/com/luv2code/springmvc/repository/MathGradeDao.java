package com.luv2code.springmvc.repository;

import com.luv2code.springmvc.models.MathGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathGradeDao extends JpaRepository<MathGrade, Integer> {


    public Iterable<MathGrade> findGradeByStudentId(int d);

    void deleteByStudentId(int id);
}
