package Reyvan;

public class fibonacci{
	
	
	public static void main(String []args) {
		
		
		int a=1;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		
		for (int i=1;i<=14;i++)
		{
			int c=a+b;
			
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}
}

//1 1 2 3 5 8 13 ......