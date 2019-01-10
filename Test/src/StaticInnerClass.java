//
//public class StaticInnerClass {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		OutClass.InnerClass.Print();// 객체 생성할 필요가 없다 -> static
//	}
//
//}
//
//class OutClass{
//	static int nVar1 = 3; //nVar1은 OutClass가 생성되기 이전에 이미 메모리에 저장되어야 함. static을 붙인다.
//	static class InnerClass{ //정적 내부 클래스
//		static void Print() { //함수도 static
//			System.out.println("static inner class");
//			System.out.println("out class static nVar1 : "+ nVar1);
//		}
//	}
//}
