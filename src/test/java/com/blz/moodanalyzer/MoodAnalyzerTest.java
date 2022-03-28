package com.blz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenHappyMoodShouldReturnHappy() throws InvalidMoodException {
        MoodAnalyzer mood = new MoodAnalyzer("Im in a Happy mood");
        String actual = mood.analyzeMood();
        String expected = "happy";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void givenAnyMoodSHouldReturnHappy() throws InvalidMoodException {
        MoodAnalyzer mood = new MoodAnalyzer("Im in Any mood");
        String actual = mood.analyzeMood();
        String expected = "happy";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenNullThrowCustomException(){
        MoodAnalyzer mood = new MoodAnalyzer(null);
        try {
            mood.analyzeMood();
        } catch (InvalidMoodException e){
            InvalidMoodException.ExceptionType expected = InvalidMoodException.ExceptionType.NULL;
            Assert.assertEquals(expected,e.exceptionType);
        }
    }

    @Test
    public void givenEmptyShouldThrowCustomException(){
        MoodAnalyzer mood = new MoodAnalyzer("");
        try {
            mood.analyzeMood();
        } catch (InvalidMoodException e) {
            InvalidMoodException.ExceptionType expected = InvalidMoodException.ExceptionType.EMPTY;
            Assert.assertEquals(expected,e.exceptionType);
        }
    }

}
