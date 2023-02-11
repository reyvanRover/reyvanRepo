package Reyvan;

public class arraystudy {
	
	

	public static void main(String[] args) {
		
		//int[] arr= {5,9,75,12,0,99};
		//System.out.println(arr[2]);
		//System.out.println(arr.length);
		//for(int i=0;i<5;i++) 
		//for(int i=0;i<=arr.length-1;i++)
		{
		//	System.out.println(arr[i]);
		}
		int [][]arr0= {{54,23,45,98,67},{52,63,87,41,49}};//how will you find length of this array
				                        // you have to take row and coloumn manually from user
		//System.out.println(arr1[0][1]);//0th row and 1st column
		for(int j=0;j<2;j++)
		{
			for(int k=0;k<5;k++)
			{
			System.out.println(arr0[j][k]);
		    }
	     }
		String m4="my favourite car is range rover";
		String []arr5=m4.split(" ");//where there is space it will split there.
		System.out.println(arr5[1]);
		String m3="my&test&is&done";
		String [] arr1=m3.split("&");//where there is & it will split there
		System.out.println(arr1[3]);
}
}
