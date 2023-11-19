package com.example.amenapp.repositories;

import com.example.amenapp.entities.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter,Integer> {
}
