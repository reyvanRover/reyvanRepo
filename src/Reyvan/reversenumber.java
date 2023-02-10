package Reyvan;

public class reversenumber{

	public static void main(String[] args) {
		int a=12345;
		int rev=0;
		while(a>0)
		{
			int b=a%10;            //5..... 4 .....3...... 2...... 1
                                   
                                   //5       54      543     5432     54321 
              rev=rev*10+b;                 // 5,5*10+4,54*10+3,543*10+2,5432*10+1
			a=a/10;
		}
		System.out.print(rev);

	}

}
