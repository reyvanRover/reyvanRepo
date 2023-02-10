package Reyvan;

public class Stringclass {
	
	public static void main(String[] args) {
		
		 String s="range rover";
		 String s1="range rover";// remember both s&s1 are having same values so they stored at one location.
		String s2="RANGE ROVER"; //
		String m=new String("range rover");// we are using "new" keyword here
		String m1=new String("range rover");//although m&m1 values are same but it wont save in same memory location
		String m2=new String("RANGE ROVER");
		System.out.println(s==s1); //when u write == memory location compares not values
		System.out.println(s.equals(s1));//checks the values
		System.out.println(s==m); //see although both s&m are having same values result false
		System.out.println(m==m1); //again == compares memory location but with "new" keyword,every time will store to different memory location
		System.out.println(m.equals(m1));
		System.out.println(s.equals(m));//with this syntax we compare values hence result true
		System.out.println(s.equalsIgnoreCase(m1));
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(m2.toLowerCase());
		String m4="my favourite car is range rover";
		String []arr=m4.split(" ");//where there is space it will split there.
		System.out.println(arr[1]);
		String m3="my&test&is&done";
		String [] arr1=m3.split("&");//where there is & it will split there
		System.out.println(arr1[3]);
		
		// read all comments carefully.
		
		
	}

}
