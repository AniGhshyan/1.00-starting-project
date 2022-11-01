package com.luv2code.springmvc.repository;

import com.luv2code.springmvc.models.ScienceGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScienceGradeDao extends JpaRepository<ScienceGrade, Integer> {


    public Iterable<ScienceGrade> findGradeByStudentId(int id);

    void deleteStudentById(int id);
}
