package com.group.assignment.studentmgmt.springCRUD.repository;

import com.group.assignment.studentmgmt.springCRUD.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
