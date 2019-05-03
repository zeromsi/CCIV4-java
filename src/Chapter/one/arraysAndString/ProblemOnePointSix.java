package Chapter.one.arraysAndString;

//Given an image represented by an NxN matrix, where each pixel in the image is 4
//bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

//original
/*
 *  6 3 0
 *  7 4 1
 *  8 5 2
 */

//after 90 degree rotation
/* 8 7 6
 * 5 4 3
 * 2 1 0
 */
public class ProblemOnePointSix {

	public static void main(String[] args) {
		int arr[][] = { { 6, 3, 0 }, { 7, 4, 1 }, { 8, 5, 2 } };
		// converted {{8,7,5},{5,4,3},{2,1,0}};
		print(arr);

		int rotatedArray[][] = nintyDegreeRotation(arr);
		System.out.println();
		print(rotatedArray);
	}

	private static int[][] nintyDegreeRotation(int[][] arr) {
		int firstArr[]=new int[3];
		int secondArr[]=new int[3];
		int thirdArr[]=new int[3];
		for(int i=0;i<arr.length;i++) {
			int c1= arr[arr.length-1-i][0];	
			int c2= arr[arr.length-1-i][1];	
			int c3= arr[arr.length-1-i][2];	
			firstArr[i]=c1;
			secondArr[i]=c2;
			thirdArr[i]=c3;
		}
		int temp[][]= {firstArr,secondArr,thirdArr};
		return temp;
	}

	public static void print(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			int temp[] = arr[i];
			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[j] + " ");
			}
			System.out.println();
		}
	}

}
