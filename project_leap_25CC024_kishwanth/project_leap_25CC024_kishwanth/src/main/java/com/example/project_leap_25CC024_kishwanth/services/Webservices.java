package com.example.project_leap_25CC024_kishwanth.services;
import com.example.project_leap_25CC024_kishwanth.model.Student;
import java.util.List;
public interface Webservices
{
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student>readStudents();
Student updateStudent(Student student);
}
