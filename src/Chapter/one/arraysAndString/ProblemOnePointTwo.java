package Chapter.one.arraysAndString;

import java.util.Scanner;

// Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
// five characters, including the null character.)
public class ProblemOnePointTwo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(reversedString(sc.next()));

	}
	
	static String reversedString(String str) {
		if(str.length()<2) {
			return str;
		}
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		
		return temp;
		
	}

}
