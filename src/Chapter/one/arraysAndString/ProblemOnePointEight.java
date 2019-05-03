package Chapter.one.arraysAndString;

public class ProblemOnePointEight {
//	Assume you have a method isSubstring which checks if one word is a substring of
//	another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
//	only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
	public static void main(String[] args) {
		System.out.println(checkIfStringIsARotation("waterbottle", "erbottlewat"));
	}

	public static boolean checkIfStringIsARotation(String s1, String s2) {
		if (s1.length() == s2.length()) {
			String s2s2 = s2 + s2;
			return isSubstring(s2s2, s1);
		}
		return false;
	}

	public static boolean isSubstring(String str, String substr) {
		if (str.contains(substr)) {
			return true;
		}

		return false;

	}

}
