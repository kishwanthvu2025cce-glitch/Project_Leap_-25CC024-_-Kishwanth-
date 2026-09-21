package com.example.project_leap_25CC024_kishwanth.repository;

import com.example.project_leap_25CC024_kishwanth.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Webrepository extends JpaRepository<Student,Long> {
}
