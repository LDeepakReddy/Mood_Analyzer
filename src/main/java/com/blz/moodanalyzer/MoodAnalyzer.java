package com.blz.moodanalyzer;

public class MoodAnalyzer {
    public String message;

    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() throws InvalidMoodException {
        try {
            if (this.message.isEmpty())
                throw new InvalidMoodException("Enter valid mood", InvalidMoodException.ExceptionType.EMPTY);
            else if (this.message.contains("Sad"))
                return "Sad";
            return "Happy";
        } catch (NullPointerException e) {
            throw new InvalidMoodException("Enter valid mood", InvalidMoodException.ExceptionType.NULL);
        }
    }
}