
public class AutoboxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer IntVar =12;
		int nVar = 3;
		int total = nVar + IntVar; //IntVar.intValue()
		System.out.println("autoboxing : "+IntVar);
		System.out.println("합 : "+ total);
		
		IntVar++;
		System.out.println("++autoboxing :" + IntVar);
		
		System.out.println("return : "+ Add(IntVar));
	}
	
	public static int Add(Integer IntVar) {
		int nVar =3;
		return nVar + IntVar;
	}

}
