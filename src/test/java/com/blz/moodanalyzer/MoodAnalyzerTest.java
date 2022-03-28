package com.blz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {


    MoodAnalyzer mood =new MoodAnalyzer();
@Test
    public void givenHappyMoodShouldReturnHappy(){
    MoodAnalyzer mood =new MoodAnalyzer();
   String actual= mood.analyzeMood("Im in a Happy mood");
   String expected="happy";
    Assert.assertEquals(expected,actual);
    }
    @Test
    public void givenAnyMoodSHouldReturnHappy(){
        MoodAnalyzer mood =new MoodAnalyzer();
    String actual=mood.analyzeMood("Im in Any mood");
    String expected="happy";
    Assert.assertEquals(expected,actual);
    }
}
