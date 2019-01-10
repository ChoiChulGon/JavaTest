
public class InheritanceOverwritingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C C_Test = new C();
		A A_Ref = C_Test; //A를 참조하는 A_Ref
		A_Ref.Print1();
		//A_Ref.Print3(); 
		
		A A_Test = C_Test;
		A_Test.Print1();
	}

}

class A{ //  C->B->A
	public void Print1() {
		System.out.println("class A");
	}
}

class B extends A{
	public void Print1() {
		System.out.println("class B");
	}
	
	public void Print2() {
		System.out.println("class B");
	}
}

class C extends B{
	public void Print1() {
		System.out.println("class C");
	}
	public void Print3() {
		System.out.println("class C");
	}
}
