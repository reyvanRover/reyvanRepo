package Reyvan;

public class prime {

	public static void main(String[] args) {          
		int n=17;
		int count=0;                                                                
		
		
		for(int i=1;i<=n;i++)      //
		{
			if(n%i==0) {
			count++; ////2
			}
		}
		
		
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime");
		}

	}

}
