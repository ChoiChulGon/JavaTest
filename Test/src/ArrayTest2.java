import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"박","이","병","이","류"}; 
		double[] score = new double[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i< strArr.length;i++) {
			score[i] = sc.nextDouble();
		}
		for(int i = 0 ; i < score.length;i++) {
		System.out.printf("%s의 점수는 \t %.2f이다.\n", strArr[i], score[i]);
		}
		
		System.out.println(Arrays.toString(strArr));
		String[] strArr1 = null;
		
		strArr1 = Arrays.copyOf(strArr, strArr.length); //값만 대입
		System.out.println(Arrays.toString(strArr1));
		
		System.out.println(strArr);
		System.out.println(strArr1);
		
		strArr1 = strArr; //가리키는 주소 대입
		System.out.println(strArr);
		System.out.println(strArr1);
		
		int[][] arr2 = new int[3][2];
		arr2[0][0] = 10;
		arr2[0][1] = 20;
		arr2[1][0] = 30;
		arr2[1][1] = 40;
		arr2[2][0] = 50;
		arr2[2][1] = 60;
		System.out.println(arr2.length);
		for(int i = 0 ; i < arr2.length; i++) {
			for(int j = 0 ; j < arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		
	}

}
