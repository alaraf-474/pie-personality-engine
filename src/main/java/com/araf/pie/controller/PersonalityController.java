package com.araf.pie.controller;

import com.araf.pie.model.Question;
import com.araf.pie.service.PersonalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personality")
public class PersonalityController {

    @Autowired
    private PersonalityService personalityService;

    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return personalityService.getQuestions();
    }

    // Later: We'll add POST method to handle answers
}
