package testfizzbuzz;

public class FizzBuzz {

	public static final String SPACE = " ";
	public static final String SEPARATOR = ",";

	public String generate(int inputNumber) {
		String fizzbuzzString = getFizzbuzzString(inputNumber);
		if (!fizzbuzzString.isEmpty()) return fizzbuzzString;
		return String.valueOf(inputNumber);
	}

	private static String getFizzbuzzString(int inputNumber) {
		String fizzbuzzString = "";
		if(inputNumber%3==0)
			fizzbuzzString+="Fizz";
		if(inputNumber%5==0)
			fizzbuzzString+="Buzz";
		return fizzbuzzString;
	}

	public String generateFizzBuzzSuit(int startNumber, int endNumber) {
		int index = startNumber;
		StringBuilder fizzbuzzSuit = new StringBuilder();
		while (index <= endNumber){
			fizzbuzzSuit.append(generate(index));
			if (index<endNumber){
				fizzbuzzSuit.append(SEPARATOR);
				fizzbuzzSuit.append(SPACE);
			}
			index++;
		}
		return fizzbuzzSuit.toString();
	}
}
