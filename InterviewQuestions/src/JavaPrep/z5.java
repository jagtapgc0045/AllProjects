package JavaPrep;

public class z5 {

	public static void main(String[] args) {
		String input = "Welcome";
		System.out.println("Input: " + input);
		System.out.println("Output: " + reverseString(input));
	}

	private static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

}
