package Reyvan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class hashMapCollections {

	public static void main(String[] args) {
	
		HashMap <Integer,String>hp=new HashMap<>();  //non synchronous and not thread safe
		Hashtable <Integer,String>hp1=new Hashtable<>();    
		hp1.put(0,"jkkjk");
		System.out.println(hp1);
		hp.put(null, "ok");
		hp.put(null, null);
	     hp.put(6, null);
	     hp.put(11, null);
	    
		
		hp.put(0,"tata");
		hp.put(1,"hello");
		hp.put(2,"bye");
		
		hp.put(3,"where");
		hp.put(9, "yes");
		System.out.println(hp.get(5));
		System.out.println(hp);
		HashSet<String>hs=new HashSet<>(hp.values());//converting map values into Set
		HashSet<Integer>hs1=new HashSet<>(hp.keySet());//converting map keys into set
		System.out.println(hs);
		
		Iterator<String>i=hs.iterator();
		Iterator<Integer>i1=hs1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		

	}

}
