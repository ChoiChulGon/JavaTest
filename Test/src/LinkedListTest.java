import java.util.Collections;
import java.util.LinkedList;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(7);
		ll.add(3);
		ll.add(5);
		ll.add(1);
		ll.add(2);
		ll.add(4);
		ll.add(6);
		
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.size());
		
		ll.remove(3);
		System.out.println(ll);
		ll.set(3, 12);
		System.out.println(ll);
		
		Collections.sort(ll);
		System.out.println(ll);
		ll.clear();
		System.out.println(ll.size());
	}

}
