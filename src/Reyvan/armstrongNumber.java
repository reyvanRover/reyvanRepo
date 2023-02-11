package Reyvan;

public class armstrongNumber {

	public static void main(String[] args) {
		
		  int b=1634;
		
         int a=1634;             //1^3+5^3+3^3=153      1634=1^4+6^4+3^4+4^4    
		 double arm=0;       
		
		int n=String.valueOf(a).length();   
	
		while(a>0)                               //1%10    
		{
			int c=a%10;                           // 1    
			a=a/10;                               //1 
		    arm=arm+Math.pow(c, n);           //c^n  4^4+0     =4^4+3^4+6^4+1^4
		}
		
		
		
		
       if (arm==b)
       {
    	   System.out.println("armstrong number");
       }
       else
    	   System.out.println("not armstrong");
		
		
		
	     

	}

	
	}


