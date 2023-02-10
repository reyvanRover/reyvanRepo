package Reyvan;

public class LargestFromMultidimensionArray {

	public static void main(String[] args) {
		int [][]b= {{9,8,6},{5,4,11},{15,3,1}};
		int max=b[0][0];   //you can try for minimum also
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				if(b[i][j]>max)
				{
					max=b[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
