import java.util.LinkedList;

public class LinkedListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Person> ll = new LinkedList(); // type이 클래스변수임
		ll.add(new Person("A Name"));
		ll.add(new Person("B Name"));
		ll.add(new Person("C Name"));
		ll.add(new Person("D Name"));
		ll.add(new Person("F Name"));
		System.out.println("명단 : ");
		for(int i = 0 ; i < ll.size();i++) {
			System.out.println(ll.get(i).strName);
		}
		System.out.println();
		System.out.println("검색 : ");
		for(int i = 0 ; i< ll.size();i++) {
			if(ll.get(i).strName.equals("C Name")) {
				System.out.println(ll.get(i).strName + " 을 "+ (i+1) + "번째에서 찾았다.");
				break;
			}
		}
		System.out.println();
		System.out.println("삭제 : ");
		ll.remove(3);
		for(int i = 0 ; i < ll.size();i++) {
			System.out.println(ll.get(i).strName);
		}
		
		System.out.println();
		System.out.println("삽입 : ");
		ll.add(3, new Person("Z Name"));
		for(int i = 0 ; i <ll.size();i++) {
			System.out.println(ll.get(i).strName);
		}
	}

}

class Person{
	String strName;
	public Person(String str) {
		strName = str;
	}
}