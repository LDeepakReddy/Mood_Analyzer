package com.blz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenHappyMoodShouldReturnHappy() {
        MoodAnalyzer mood = new MoodAnalyzer("Im in a Happy mood");
        String actual = mood.analyzeMood();
        String expected = "happy";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenAnyMoodSHouldReturnHappy() {
        MoodAnalyzer mood = new MoodAnalyzer("Im in Any mood");
        String actual = mood.analyzeMood();
        String expected = "happy";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenNullShouldReturnHappy() {
        MoodAnalyzer mood = new MoodAnalyzer(null);
        String actual = mood.analyzeMood();
        String expected = "happy";
        Assert.assertEquals(expected, actual);
    }
}
