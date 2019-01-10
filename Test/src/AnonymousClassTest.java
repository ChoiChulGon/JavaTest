
public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass Test1 = new InterfaceClass() {
			public void Print() {
				System.out.println("Anonymous interface!");
			}
		};
		Test1.Print();
		
		classA Test2 = new classA() {
			public void Print() {
				System.out.println("Anonymous interface!");
			}
		};
		Test2.Print();
		
		classA test3 = new classA() {
			public void Print() {
				System.out.println("Anonymous interface!");
			}
		};
		test3.Print();
		
		classB test4 = new classB();
		test4.SetClass(new classA());
		
		test4.SetClass(new classA(){
			public void Print() {
				System.out.println("hi");
			}
		});
	}

}

class InterfaceClass implements Testable{
	public void Print() {
		System.out.println("hi");
	}
}

class classA{
	public void Print() {
		System.out.println("good");
	}
}

class classB{
	public void SetClass(classA ObjectA) {
		ObjectA.Print();
	}
}

interface Testable{
	public void Print();
}