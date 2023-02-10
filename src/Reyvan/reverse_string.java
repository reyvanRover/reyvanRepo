package Reyvan;

public class reverse_string {

	public static void main(String[] args) {
		
		String r="Nitin";   //  4 3 2 1 0
		String rev="";
		for(int i=r.length()-1;i>=0;i--)
		{
			char ch=r.charAt(i);   
			rev=rev+ch;	  
		}
		System.out.println(rev);
		
		
//		if(r.equalsIgnoreCase(rev))
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//	}

	}
}
