package com.araf.pie.service;

import com.araf.pie.model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    private List<Question> questions = new ArrayList<>();

    public QuestionService() {
        questions.add(new Question("Q1", "Do you prefer to work alone or in a group?", "behavior"));
        questions.add(new Question("Q2", "How often do you buy new clothes?", "attire"));
        questions.add(new Question("Q3", "Do you like trying new things?", "behavior"));
        questions.add(new Question("Q4", "Do you follow fashion trends?", "attire"));
    }

    public List<Question> getAllQuestions() {
        return questions;
    }
}
