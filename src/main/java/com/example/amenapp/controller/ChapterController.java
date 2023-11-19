package com.example.amenapp.controller;


import com.example.amenapp.entities.Chapter;
import com.example.amenapp.service.IServiceChapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chapters/")
public class ChapterController
{
    @Autowired
    IServiceChapter isc;

    @GetMapping("")
    public List<Chapter> getall() {
        return isc.findAllChapter();
    }

    @GetMapping("/{id}")
    public Chapter getparid(@PathVariable int id) {
        return isc.findChapterById(id);
    }

    @PostMapping("/add")
    public Chapter add(@RequestBody Chapter c) {
        return isc.createChapter(c);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        isc.deleteChapterById(id);
    }
}
