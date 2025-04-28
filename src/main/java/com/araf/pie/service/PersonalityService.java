package com.araf.pie.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class PersonalityService {

    public Map<String, String> analyzePersonality(Map<String, String> answers) {
        Map<String, String> feedback = new HashMap<>();

        // Basic example logic
        String mindset = answers.getOrDefault("mindset", "average");
        String income = answers.getOrDefault("income", "middle");
        String lifestyle = answers.getOrDefault("lifestyle", "normal");

        // Simple feedback based on mindset
        if (mindset.equalsIgnoreCase("growth")) {
            feedback.put("mindsetFeedback", "You have a growth mindset! You adapt and learn continuously.");
        } else if (mindset.equalsIgnoreCase("fixed")) {
            feedback.put("mindsetFeedback", "Consider adopting a growth mindset to unlock more opportunities.");
        } else {
            feedback.put("mindsetFeedback", "You have a balanced mindset.");
        }

        // Feedback based on income
        if (income.equalsIgnoreCase("high")) {
            feedback.put("incomeFeedback", "You can afford premium attire and tailor-made outfits.");
        } else if (income.equalsIgnoreCase("low")) {
            feedback.put("incomeFeedback", "Focus on affordable yet stylish clothing to maintain a smart appearance.");
        } else {
            feedback.put("incomeFeedback", "Maintain a balanced wardrobe with quality basics.");
        }

        // Feedback based on lifestyle
        if (lifestyle.equalsIgnoreCase("active")) {
            feedback.put("lifestyleFeedback", "Choose flexible, comfortable clothes suitable for movement.");
        } else if (lifestyle.equalsIgnoreCase("corporate")) {
            feedback.put("lifestyleFeedback", "Invest in formal, professional outfits for your work environment.");
        } else {
            feedback.put("lifestyleFeedback", "Choose versatile casuals that fit multiple settings.");

        }

        return feedback;
    }
}
