//public class ExceptionProcessingTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int nVar = 0;
//		//int nVar = 7; // finally만 출력
//		int[] arr = {1,2,3,4,5};
//		int nResult;
//		
//		try {
//			nResult = 7/nVar;
//		}catch(ArithmeticException e) {
//			System.out.println("failed");
//		}
//		
//		try {
//			for(int i = 0 ; i < 6; i++) {
//				System.out.println(arr[i]);
//			}
//		}catch(ArithmeticException e) {
//			System.out.println("Arithmetic failed");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Index Out!");
//		}
//		System.out.println();
//		try {
//			nResult = 7/nVar;
//		}catch(ArithmeticException e) {
//			System.out.println("failed");
//		}finally {
//			System.out.println("good bye");
//		}
//	}
//
//}
