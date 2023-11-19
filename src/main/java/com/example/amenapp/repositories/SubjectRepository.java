package com.example.amenapp.repositories;

import com.example.amenapp.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Integer> {
}
