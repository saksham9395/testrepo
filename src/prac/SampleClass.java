package prac;

import java.util.*;

public class SampleClass {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
		list.add("Saksham");
		list.add("abc");  
		list.add("Saksham");  
		list.add("xyz");  
		list.add("xyz");  
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		}
		
		System.out.println("-------------------"); 
		
		list.set(2, null);
		Iterator<String> itr2=list.iterator();
		while(itr2.hasNext()){  
			System.out.println(itr2.next()); 
		}
		
		/*LinkedList<String> llist=new LinkedList<String>();  
		llist.add("Saksham");
		llist.add("abc");  
		llist.add("Saksham");  
		llist.add("xyz");  
		llist.add("xyz");  
		//Traversing list through Iterator  
		Iterator<String> itrL=list.iterator();  
		while(itrL.hasNext()){  
		System.out.println("LInked list " + itrL.next()); 
		
		HashSet<String> set=new HashSet<String>();  
		set.add("def");  
		set.add("xyz");  
		set.add("def");  
		set.add("fgi");  
		set.add(null);  
		set.add(null);  
		//Traversing elements  
		Iterator<String> itrhs=set.iterator();  
		while(itrhs.hasNext()){  
		System.out.println(itrhs.next());  
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("def");  
		set.add("xyz");  
		set.add("def");  
		set.add("fgi");  
		set.add(null);  
		set.add(null);  
		//Traversing elements  
		Iterator<String> itrhs=set.iterator();  
		while(itrhs.hasNext()){  
		System.out.println(itrhs.next());  */
	}



}

