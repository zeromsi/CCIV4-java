package Chapter.one.arraysAndString;

import java.util.Arrays;
import java.util.Scanner;

// Write a method to decide if two strings are anagrams or not. 
public class ProblemOnePointFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			System.out.println(checkIfStringsAreAnagrams(str1, str2));
		}
	}

	static boolean checkIfStringsAreAnagrams(String str1, String str2) {
		if (sortString(str1).equals(sortString(str2))) {
			return true;
		}
		return false;

	}

	static String sortString(String str) {
		char[] chars = str.toLowerCase().toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

}
