package MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	@Test
	public void givenMood_WhenHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		String mood = moodAnalyser.analyzeMood("HAPPY");
		// assertTrue( true );
		Assert.assertEquals("HAPPY", mood);	
		}
	@Test
	public void givenMood_WhenSAD_ShouldReturnSAD() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		String mood = moodAnalyser.analyzeMood("SAD");
		// assertTrue( true );
		Assert.assertEquals("SAD", mood);	
		}
}
