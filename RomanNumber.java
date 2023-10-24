package BE5day7;

public class RomanNumber {
	public int numValue(char roman) {
		if (roman == 'I')
			return 1;
		if (roman == 'V')
			return 5;
		if (roman == 'X')
			return 10;
		if (roman == 'L')
			return 50;
		if (roman == 'C')
			return 100;
		if (roman == 'D')
			return 500;
		if (roman == 'M')
			return 1000;
		return -1;

	}

	public int convertRoman(String input) {
		int sum = 0;
		int sum1;
		int sum2;
		for (int i = 0; i < input.length(); i++) {
			sum1 = numValue(input.charAt(i));
			if (i + 1 < input.length()) {
				sum2 = numValue(input.charAt(i + 1));
				if (sum1 >= sum2) {
					sum = sum + sum1;
				} else {
					sum = sum - sum1;
				}
			} else {
				sum = sum + sum1;
			}
		}
		return sum;
	}

	public static void main(String args[]) {
		RomanNumber romanNumber = new RomanNumber();
		String input = "XIV";
		System.out.println(input + " = " + romanNumber.convertRoman(input));

	}

}
