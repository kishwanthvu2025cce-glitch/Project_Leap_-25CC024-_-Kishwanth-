package com.example.project_leap_25CC024_kishwanth.services.impl;

import com.example.project_leap_25CC024_kishwanth.model.Student;
import com.example.project_leap_25CC024_kishwanth.repository.Webrepository;

import com.example.project_leap_25CC024_kishwanth.services.Webservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebservicesImpl implements Webservices {
    @Autowired
     private Webrepository webrepository;


    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public List<Student> readStudents() {
        return List.of();
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }
}