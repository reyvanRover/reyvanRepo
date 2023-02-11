package Reyvan;

public class Array {

	public static void main(String[] args) {
		
		String []a = {"revan","range","rover","honda"};
		int m=0;
	      int b=a.length;
	      a[2]="tata";
	      for(int i=0;i<a.length;i++)
	      {
	    	  System.out.println(a[i]);
	      }
	      System.out.println(b);
	      String [][]k= {{"hello","world"},{"hi","how","are","you"}};
	      k[0][1]="universe";
	     int n= k.length;
	     System.out.println(n);
	     System.out.println(k[0][1] +" " +k[1][3]);
	     
	     Object[]z= {"revan",1234,true,'H',5.98,"tvs"};
	     System.out.println(z[2]);
	     
	      
	   
	}

}
