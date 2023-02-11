package Reyvan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class StringFunctions {

	public static void main(String[] args) {
		String r="revan129baba34t";
		
		int t=Integer.parseInt(r.replace("revan","").replace("baba", "").replace("t","" ));
		System.out.println(t);
		
		List<Integer>numberlist=new ArrayList<>();
//   	numberlist.add(null);
//		numberlist.add(null);
//		numberlist.add(null);
		System.out.println(numberlist);  //observe List accepts any number of null value but set accept only one
		numberlist.add(55);
		numberlist.add(3);
		numberlist.add(25);
		numberlist.add(18);
		numberlist.add(99);
		Collections.sort(numberlist);
		Collections.reverse(numberlist);
		System.out.println(numberlist);
		numberlist.add(159);
		numberlist.add(0,26);
		numberlist.set(3,19);
		System.out.println(numberlist); 
		System.out.println(numberlist.size());
		numberlist.clear();
		System.out.println(numberlist);
		
		
	}

}
