package Reyvan;

public class StringStringBufferStringBuilder {

	public static void main(String[] args) {
		String a="velocity";
	          // a="tata";
		String b="velocity";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		StringBuffer c=new StringBuffer("tata");
		 //c=new StringBuffer("moto");
		 //c.append("ratan ");
		
		System.out.println(c);
		StringBuffer e=new StringBuffer("tata");
		StringBuilder d=new StringBuilder("tata");
		System.out.println(d);
		//System.out.println(c==d);
		System.out.println(c.equals(d));
		
		
		
		
		

	}

}
