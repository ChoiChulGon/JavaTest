import java.util.*;


//기본 데이터 형 -> wrapper 클래스로 변환
public class VecterClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector MyVector = new Vector();
		MyVector.addElement(123);
		MyVector.addElement(3.14f);
		MyVector.addElement("java!");
		MyVector.addElement("하이!");
		System.out.println(MyVector);
		System.out.println(MyVector.elementAt(2));
		System.out.println(MyVector.firstElement());
		System.out.println(MyVector.lastElement());
		System.out.println(MyVector.size());
		
		System.out.println();
		Vector<String> MyVector2 = new Vector();
		MyVector2.add("java");
		MyVector2.add("programming");
		MyVector2.add("android");
		MyVector2.add("hope");
		System.out.println(MyVector2);
		System.out.println(MyVector2.get(2));
		System.out.println(MyVector2.indexOf("hope"));
		int num = MyVector2.indexOf("android");
		System.out.println(MyVector2.get(num));
	}

}
