package MoodAnalyser;

public class MoodAnalyzer {

	String message;

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public MoodAnalyzer() {
	}

	public String analyzeMood() throws MoodAnalyzerException {

		try {
			if (message.equals(null)) {
				throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionTypes.NULL_POINTER_EXCEPTION);
			} else if (message.isEmpty()) {
				throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionTypes.EMPTY_STRING_EXCEPTION);
			}
			if (message.contains("SAD")) {
				return "SAD";
			}
				return "HAPPY";
		} catch (Exception e) {
			e.printStackTrace();
			return "HAPPY";
		}

	}
}
