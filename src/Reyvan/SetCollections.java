package Reyvan;

import java.util.HashSet;
import java.util.Iterator;

public class SetCollections {

	public static void main(String[] args) {
		HashSet<Object>hs=new HashSet<>();
		hs.add("vello");
		hs.add("range");
		hs.add("tata");
		
		hs.add(9);
		hs.add("power");    ////as Set does not save values in sequential manner there is no get() and indexof() methods in set
	
		System.out.println(hs);
		
		System.out.println(hs.remove("range")); //cannot pass index in remove method in set you have to pass value
		System.out.println(hs);
		System.out.println(hs.size());
		Iterator<Object>i=hs.iterator();  ///read the notes for pictorial explanation how hasnext and next works. 
		                                   ///
		while(i.hasNext())     //hasNext() check next index is present or not & if present it returns true.
		{
			System.out.println(i.next()); /// we created object i & now i.next() points to the value in first index...
		}                                    //and if you write i.next() again it will focus on value present at 2nd index
//		String p=i.next();
//		System.out.println(p);
//		String d=i.next();        
//		System.out.println(d);   ///  i      
	}

}
