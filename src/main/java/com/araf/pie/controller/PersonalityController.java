package com.araf.pie.controller;

import com.araf.pie.model.Question;
import com.araf.pie.service.PersonalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/personality")
public class PersonalityController {

    private final PersonalityService personalityService;

    @Autowired
    public PersonalityController(PersonalityService personalityService) {
        this.personalityService = personalityService;
    }

    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return personalityService.getQuestions();
    }



    @PostMapping("/analyze")
    public Map<String, String> analyzePersonality(@RequestBody Map<String, String> answers) {
        return personalityService.analyzePersonality(answers);
    }
}
