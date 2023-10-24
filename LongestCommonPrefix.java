package BE5day7;

public class LongestCommonPrefix {
	public String commonPrefix(String[] arr) {

		String result = arr[0];
		for (int i = 0; i < arr.length; i++) {
			while (arr[i].indexOf(result) != 0) {
				result = result.substring(0, result.length() - 1);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		LongestCommonPrefix logestPre = new LongestCommonPrefix();
		String[] input = { "flower", "flow", "flight" };
		System.out.println("Longest common prefix is: " + logestPre.commonPrefix(input));

	}

}
