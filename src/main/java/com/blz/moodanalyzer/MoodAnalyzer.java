package com.blz.moodanalyzer;

public class MoodAnalyzer {

    public String analyzeMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "sad";
        }
        return "happy";
    }
}