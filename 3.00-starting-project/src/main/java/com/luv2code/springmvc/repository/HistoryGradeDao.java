package com.luv2code.springmvc.repository;

import com.luv2code.springmvc.models.HistoryGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryGradeDao extends JpaRepository<HistoryGrade,Integer> {


    Iterable<HistoryGrade> findGradeByStudentId(int id);

    void deleteStudentById(int id);
}
