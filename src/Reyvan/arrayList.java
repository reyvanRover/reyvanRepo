package Reyvan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {

    ArrayList <String>list=new ArrayList<>();
    list.add("power");  
    list.add("range");  
    list.add("car");
    list.add("rover");
    list.add("mountain");
    list.add("climate");
    list.set(5,"cool");
    System.out.println(list.get(5));
   list.size();
   System.out.println(list.size());
    System.out.println(list.contains("range"));
     //list.clear();
     // list.remove(2);
    String[]arr= {"parallel","nova","lock","how"};
    List<String>arraylist2=Arrays.asList(arr);
   boolean p= arraylist2.contains("lock");//will return true
    System.out.println(list.isEmpty());   
    System.out.println(list.indexOf("mountain"));
    System.out.println(p);
   
   
   
    

	}

}
