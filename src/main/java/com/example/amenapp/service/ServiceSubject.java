package com.example.amenapp.service;

import com.example.amenapp.entities.Subject;
import com.example.amenapp.repositories.StudentRepository;
import com.example.amenapp.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceSubject implements IServiceSubject{

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public Subject createSubject(Subject s) {
        return subjectRepository.save(s);
    }

    @Override
    public Subject findSubjectById(Integer id) {
        return subjectRepository.findById(id).get();
    }

    @Override
    public List<Subject> findAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public void deleteSubjectById(Integer id) {
        subjectRepository.deleteById(id);
    }
}
