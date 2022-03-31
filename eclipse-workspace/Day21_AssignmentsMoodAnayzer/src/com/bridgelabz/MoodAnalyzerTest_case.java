package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import moodanalyser.MoodAnalyser;
import moodanalyser.MoodAnalysisException;

class MoodAnalyzerTest_case {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenNullMood_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenEmptyMood_ShouldThrowException_withType() {
		MoodAnalyser realMoodAnalyser = new MoodAnalyser("");
		try {
			realMoodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.getType());
		}
	}

	@Test
	public void givenNullMood_ShouldThrowException_withType() {
		MoodAnalyser realMoodAnalyser = new MoodAnalyser(null);
		try {
			realMoodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.getType());
		}
	}

}