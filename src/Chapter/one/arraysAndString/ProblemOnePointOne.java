package Chapter.one.arraysAndString;

//
//Implement an algorithm to determine if a string has all unique characters. What if you
//can not use additional data structures?
public class ProblemOnePointOne {

	public static void main(String[] args) {
		String str = "abcdefgh".toLowerCase();
		SolveProblemInOn2(str);
		SolveProblemInOn(str);

	}
	
	static void SolveProblemInOn2(String str){
		
		boolean res = true;
		for (int i = 0; i < str.length(); i++) {
			if (checkIfCharacterExists(str.charAt(i), str) == false) {
				res = false;
				System.out.println("All characters aren't unique");
				break;
			}
		}

		if (res == true) {
			System.out.println("All characters are unique");
		}
	}
	
	static void SolveProblemInOn(String str) {
		boolean res=checkIfCharacterExists(str);
		if(res==false) {
			System.out.println("All characters aren't unique");
		}else {
			System.out.println("All characters are unique");
		}
	}
	public static boolean checkIfCharacterExists(String str){
		boolean char_set[] =new boolean[256];
		for(int i=0;i<str.length();i++) {
			int val=str.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val]=true;
		}
		return true;
	}

	public static boolean checkIfCharacterExists(Character c, String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (c.equals(str.charAt(i))) {
				count++;
			}
		}
		if (count < 2) {
			return true;
		} else {
			return false;
		}

	}

}
