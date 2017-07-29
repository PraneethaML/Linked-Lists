
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Set;

public class Creation {

	
		public static void main(String args[]){
			LinkedList<Integer> ll= new LinkedList<Integer>();
			Hashtable hm=new Hashtable();
			ll.add(1);
			ll.add(3);
			ll.add(2);
			ll.add(2);
			ll.add(4);
			ll.add(5);
			ll.add(3);
			System.out.println(ll.toString());
		//cracking the coding Linked Lists 2.1
			
			// REMOVE DUPLICATES FROM UNSORTED LINKED LISTS
		/*-
		 * 
		 *  System.out.println("before removing duplicates");
			System.out.println(ll.toString());
			System.out.println("after removing duplicates");
			for(int i:ll){
				if(hm.containsKey(i)){
					hm.remove(i);
					continue;
				}
				else
					System.out.println(i);
					hm.put(i, i*10);
				
			}
			Set s=hm.keySet();
			System.out.println(s);
			
			*/
			
		//2.2 FIND K'TH TO LAST ELEMENT OF A SINGLY LINKED LIST
			
		/*	
		 * 
		 * int n=ll.size();
			System.out.println(n);
		    int k=	ll.get(n-4);  //n-k+1
			System.out.println("5 element from last :"+k);
	
	       */
		
			
		//2.4 PARTITION A LINKED LIST TO A VALUE X SUCH THAT NODES LESS THAN X COME BEFORE ALL NODES GREATER THAN OR EQUAL TO X
		/*
		 * 
		 * 
			LinkedList<Integer> l2= new LinkedList<Integer>();
			int x=Integer.parseInt(args[0]);
			for(int i:ll){
				if(i<x){
					l1.add(i);
					}
				else{
					l2.add(i);
				}	
			}
			StringBuilder partitions=new StringBuilder();
			partitions.append(l1.toString());
			partitions.append(x);
			partitions.append(l2.toString());
			System.out.println(partitions);
			
			*/
			
			//
		}
}
