package Reyvan;

import java.util.Arrays;
import java.util.Collections;

public class XPracticeMatch {

	public static void main(String[] args) {
		
		
//		String a="billionaire a not are you";
//	
//		
//		
//	
//		
//		String [] c=a.split(" ");
//		
//		
//		
//		for(int i=c.length-1;i>=0;i--)
//		{
//			
//			System.out.print(c[i]+" ");
//			
//		}
//		
		
		String a="reyvan";
		String b=a.toLowerCase();
		int count=0;

		for(int i=0;i<b.length();i++)

		{
		    char c=b.charAt(i);
		    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
		   count++;
		}


		}
		System.out.println(count);

		
		
		

	}

}
