package Chapter.one.arraysAndString;

public class ProblemOnePointFive {
// Write a method to replace all spaces in a string with ‘%20’.
	public static void main(String[] args) {
	System.out.println(replaceSpaces("ab cd df"));
	}

	public static String  replaceSpaces(String str) {
		char [] chars = new char[expectedCharArrayLength(str)];
		int j=0;
		for(int i=0;i<str.length();i++) {
			if(i!=0) {
				j++;
			}
			char c=str.charAt(i);
			if(c==' ') {
				chars[j]='%';
				j=j+1;
				chars[j]='2';
				j=j+1;
				chars[j]='0';
			}else {
				chars[j]=c;
			}
		}
		return new String(chars);
	}
	
	static int expectedCharArrayLength(String str) {
		int length=str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				length=length+2;
			}
		}
		return length;
	}
}
