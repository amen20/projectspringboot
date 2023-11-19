package com.example.amenapp.service;

import com.example.amenapp.entities.Chapter;

import java.util.List;

public interface IServiceChapter {

    public Chapter createChapter(Chapter c);
    public Chapter findChapterById(Integer id);
    public List<Chapter> findAllChapter();
    public void deleteChapterById(Integer id);
}

