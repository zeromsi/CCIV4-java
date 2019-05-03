package Chapter.one.arraysAndString;

import java.io.IOException;

//Design an algorithm and write code to remove the duplicate characters in a string
//without using any additional buffer. NOTE: One or two additional variables are fine.
//An extra copy of the array is not.
public class ProblemOnePointThree {
	public static int removeDuplicate(char str[]){
		boolean check[] = new boolean[256];
		int index = 0;
		for(char tmp : str){
			if(check[tmp] == false){
				str[index] = tmp;
				check[tmp] = true;
				index++;
			}
				
		}
		//str[index] = '\0';
		return index;
	}
	public static void main(String args[]) throws IOException{
		String string="a2a21213";
		char str[] =string.toCharArray();
		System.out.println(str);
		int length = removeDuplicate(str);
		for(int i = 0; i <length; i++)
			System.out.print(str[i]);
		System.out.println("\n");
	}

}
