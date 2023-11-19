package com.example.amenapp.service;
import com.example.amenapp.entities.Student;

import java.util.List;
public interface IServiceStudent {
    public Student createStudent(Student s);
    public Student findStudentById(Integer id);
    public List<Student> findAllStudents();
    public void deleteStudentById(Integer id);
}
