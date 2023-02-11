package Reyvan;

public class tp3 {

	public static void main(String[] args) {
//		int a=5;
//		int b=4;
//		
//	    int sum=0;
//	    
//	    
//		for(int i=1;i<=b;i++)
//		{
//			sum=sum+a;      
//		}
//		System.out.println(sum);
		
//		
		int a=36;
		int b=5;
		int count=0;    // 25-5 20-5 15-5 10-5 5-5
		while(a>=b)       //a>0 dont work in some cases like 36/5 gives answer 8
		{
			a=a-b;
			count++;
		}
		System.out.println(count);
		
		
		
		
		
	
	}

}
