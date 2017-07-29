package package1;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>();
		LinkedList<Integer> l2=new LinkedList<Integer>();
		
		l1.add(6);
		l1.add(1);
		l1.add(7);
		
		
		
		l2.add(2);
		l2.add(9);
		l2.add(5);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		
		LinkedList<Integer> sum=addLists(l1,l2);
		System.out.println(sum.toString());
		Collections.reverse(sum);
		
		/*Reversing a linked list
		 * 
		 * int n=l2.size();
		for(int i=0;i<n/2;i++){
			int temp=l2.get(i);
			int temp2=l2.get(n-1);
			l2.set(i,temp2);
			l2.set(n-1,temp);
			
			
		}
		System.out.println("after reversal"+l2.toString());
		*/
		
	 /* Collections.reverse(l2);
	  System.out.println(l2);*/
		
		
	
	
	}

	@SuppressWarnings("null")
	/* 2 NUMBERS REPRESENTED BY A LINKED LIST-
	 *  EACH NODE CONTAINS A SINGLE DIGIT- 
	 *  DIGITS STORED IN REVERSE ORDER SUCH THAT 1'S DIGIT IS AT THE HEAD OF THE LIST-
	 *   WRITE A FUNCTION THAT ADDS THE TWO NUMBERS AND RETURNS THE SUM AS A LINKED LIST */
	
	
	
	private static LinkedList<Integer> addLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		LinkedList<Integer> sum = new LinkedList<Integer>();
		// TODO Auto-generated method stub
		
		int i=l1.size()-1, carry=0;
		while(i>=0){
			
			int value=0;
			value=l1.get(i)+l2.get(i)+carry;
			 carry=0;
			int n=value%10;
			sum.add(n);
			carry=value/10;
			i--;
		
			
		}
		
		
		return sum;
	}

	
}
