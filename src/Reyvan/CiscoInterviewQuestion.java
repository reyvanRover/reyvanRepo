package Reyvan;

public class CiscoInterviewQuestion {

	public static void main(String[] args) {
	
				int [][]b= {{5,4,9},{3,8,6},{2,7,8}};
				int max=b[0][0];
				int col=0;
				int min=Integer.MAX_VALUE;//like we write n=0 for lowest initialization
		          for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						System.out.print(b[i][j]+" ");
						if(b[i][j]>max)
						{
							max=b[i][j];  //1st ...identified max number in the array
							col=j;    
						}
					}
				    if(b[i][col]<min)
					{
						min=b[i][col];
					}
				
				    System.out.println();
					}	
		          System.out.println(max);
					System.out.println(min);
	}
		
}
	

