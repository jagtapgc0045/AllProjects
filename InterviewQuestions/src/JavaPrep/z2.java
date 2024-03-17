package JavaPrep;

import java.util.ArrayList;
import java.util.List;

public class z2 {

	public static void main(String[] args) {
		String input = "alh";
		List<String> permutations = new ArrayList<>();
		getPermutation("", input, permutations);
		System.out.println("Input: " + input);
		System.out.println("Output: " + permutations);
	}

	private static void getPermutation(String firstletter, String remaining, List<String> result) {
		int n = remaining.length();
		if (n == 0) {
			result.add(firstletter);
		} else {
			for (int i = 0; i < n; i++) {
				getPermutation(firstletter + remaining.charAt(i),
						remaining.substring(0, i) + remaining.substring(i + 1, n), result);
			}
		}
	}

}
