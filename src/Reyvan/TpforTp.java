package Reyvan;

public class TpforTp {

	public static void main(String[] args) {
		
		
		int [][]b= {{5,4,9},{3,8,6},{2,7,3}};
		int max=b[0][0];
		int col=0;
		int max2=0;
		
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(b[i][j]+" ");
				if(b[i][j]>max)
				{
					max=b[i][j];
					col=j;
				}
			
			}
		
			if(b[i][col]<max2)
			{
				max2=b[i][col];
				
			}
		    System.out.println();
			}	System.out.println(max);
			System.out.println(max2);
			
		
	
}
}
