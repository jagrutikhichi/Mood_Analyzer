package MoodAnalyser;

public class MoodAnalyzer {

	
	String message;

	public MoodAnalyzer(String message) {
		this.message = message;
	}
	

	public MoodAnalyzer() {
	}


	public String analyzeMood(String message) {

		try {
			if (message.contains("SAD"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
		

	}

}
