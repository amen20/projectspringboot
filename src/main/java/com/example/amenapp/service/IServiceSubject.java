package com.example.amenapp.service;

import com.example.amenapp.entities.Student;
import com.example.amenapp.entities.Subject;

import java.util.List;

public interface IServiceSubject {

    public Subject createSubject(Subject s);
    public Subject findSubjectById(Integer id);
    public List<Subject> findAllSubjects();
    public void deleteSubjectById(Integer id);
}
