package last3Questions;

import java.util.LinkedList;

public class Operations {
	static LinkedList<Integer> ll,l2;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		LinkedList<Integer> l2=new LinkedList<Integer>();
		
		addElement();
		display();

	}
private static void display() {
		// TODO Auto-generated method stub
		System.out.println("ll:"+ll.toString());
		System.out.println("l2:"+l2.toString());
	}
static void addElement(){
	ll.add(6);
	ll.add(1);
	ll.add(7);
	l2.add(2);
	l2.add(9);
	l2.add(5);
	
}
	
}
