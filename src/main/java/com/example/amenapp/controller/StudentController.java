package com.example.amenapp.controller;

import com.example.amenapp.entities.Student;
import com.example.amenapp.service.IServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students/")
public class StudentController {

    @Autowired
    IServiceStudent iss;

    @GetMapping("")
    public List<Student> getall() {
        return iss.findAllStudents();
    }

    @GetMapping("/{id}")
    public Student getparid(@PathVariable int id) {
        return iss.findStudentById(id);
    }

    @PostMapping("/add")
    public Student add(@RequestBody Student s) {
        return iss.createStudent(s);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        iss.deleteStudentById(id);
    }


}
