package com.example.amenapp.service;

import com.example.amenapp.entities.Student;
import com.example.amenapp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudent implements IServiceStudent{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student createStudent(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }
}
