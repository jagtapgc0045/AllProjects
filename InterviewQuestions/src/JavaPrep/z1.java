package JavaPrep;

import java.util.HashMap;

public class z1 {

	public static String findLongestSubstring(String str) {
		if (str == null || str.length() == 0) {
			return "";
		}

		HashMap<Character, Integer> charIndexMap = new HashMap<>();
		int start = 0, maxLength = 0, currentLength = 0, currentStart = 0;

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= currentStart) {
				currentStart = charIndexMap.get(currentChar) + 1;
				currentLength = i - currentStart;
			}

			currentLength++;

			if (currentLength > maxLength) {
				maxLength = currentLength;
				start = currentStart;
			}

			charIndexMap.put(currentChar, i);
		}

		return str.substring(start, start + maxLength);
	}

	public static void main(String[] args) {
		String input = "Welcome to PowerRouter";
		String result = findLongestSubstring(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + result);

	}

}
