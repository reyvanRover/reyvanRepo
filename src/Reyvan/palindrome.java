package Reyvan;

public class palindrome {

	public static void main(String[] args) {
	    String b="rot a tor";   //ni t in   2  
	    
	    		
	    int n=b.length();  //9       
	  
	    int count=0;
	    for(int i=0;i<(n/2);i++) 
	    {
	    	    int j=n-i;   //9-1
	    		if(b.charAt(i)==b.charAt(j-1))
	    		{
	    	    count++;   //4 
	    		}
	    }
	   
	   
	 if (count==n/2)
	  {
		  System.out.println("palindrome");
	  }
	  else
	  {
		  System.out.println("not palindrome");
	  }
	}

}
