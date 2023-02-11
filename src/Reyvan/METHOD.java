package Reyvan;

public class METHOD  {
	
	
	private void tata()// only accessible in this class only
	{
		int c=98;
		int a=58;
		int b=c+a;
		System.out.println("although method tata is private we called it using (this) keyword in tata2"+b);
	}
	protected void tata2()
	{
		int d=6;
		System.out.println(d);
		this.tata();
		
	
	}
	

	public static void main(String[] args) {
		

       }

}
