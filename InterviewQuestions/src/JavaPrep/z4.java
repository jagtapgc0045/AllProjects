package JavaPrep;

import java.util.Arrays;

public class z4 {

	public static void main(String[] args) {
		String str1 = "Welcome";
		String str2 = "ceelmoW";
		System.out.println("Input: " + str1);
		System.out.println("Output: " + areAnagrams(str1, str2));
	}

	private static boolean areAnagrams(String str1, String str2) {
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}

}
