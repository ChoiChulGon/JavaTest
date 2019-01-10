import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList();
		al.add(7);
		al.add(3);
		al.add(5);
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(6);
		System.out.println(al.toString());
		Collections.sort(al);
		System.out.println(al.toString());
		System.out.println(al.size());
		al.set(6, 11);
		System.out.println(al.toString());
		System.out.println(al.get(2));
		al.clear();
		System.out.println(al.size());
		
		ArrayList<String> al2 = new ArrayList();
		al2.add("java");
		al2.add("programming");
		al2.add("now");
		al2.add("hope");
		System.out.println(al2);
		int index = al2.indexOf("now"); //index 구할때 indexOf
		System.out.println(index);
		System.out.println(al2.get(index)); // 값가져올때 get
		al2.set(0, "android");
		System.out.println(al2);
		
	}

}
