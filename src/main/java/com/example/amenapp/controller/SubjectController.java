package com.example.amenapp.controller;

import com.example.amenapp.entities.Subject;
import com.example.amenapp.service.IServiceSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects/")
public class SubjectController {

    @Autowired
    IServiceSubject iss;

    @GetMapping("")
    public List<Subject> getall() {
        return iss.findAllSubjects();
    }

    @GetMapping("/{id}")
    public Subject getparid(@PathVariable int id) {
        return iss.findSubjectById(id);
    }

    @PostMapping("/add")
    public Subject add(@RequestBody Subject s) {
        return iss.createSubject(s);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        iss.deleteSubjectById(id);
    }
}
