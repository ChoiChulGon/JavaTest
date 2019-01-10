import java.util.*;

public class ArraysClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,7,2,6,3,5};
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("정렬 후 : "+Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 3));
		System.out.println(Arrays.binarySearch(arr, 14));
		
		Arrays.fill(arr, 0,3,111);
		System.out.println(Arrays.toString(arr));
	}

}
