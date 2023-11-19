package com.example.amenapp.service;

import com.example.amenapp.entities.Chapter;
import com.example.amenapp.repositories.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceChapter implements IServiceChapter{

    @Autowired
    ChapterRepository chapterRepository;

    @Override
    public Chapter createChapter(Chapter c) {
        return chapterRepository.save(c);
    }

    @Override
    public Chapter findChapterById(Integer id) {
        return chapterRepository.findById(id).get();
    }

    @Override
    public List<Chapter> findAllChapter() {
        return chapterRepository.findAll();
    }

    @Override
    public void deleteChapterById(Integer id) {
        chapterRepository.deleteById(id);
    }
}
