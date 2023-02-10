package Reyvan;

public  class constructor {
	
	int n1;
	int n2;
	int n3;
	
	
	public constructor()
	{
	  n1=58;//only initialize the variable don't declare it in constructor
	  n2=63;
	 n3=78;
	}
	private constructor(int a)
	{
		n1=a;
	}
	protected constructor(int a,int b)
	{
		n1=a*b;
	
		System.out.println(n1);
	}
	
	public constructor(int a,int b,int c)
	{
	 n1=a;n2=b; n3=c;
	}
	public void calcu()
	{
		int sum=n1+n2+n3;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		constructor d= new constructor ();
		d.calcu();
		constructor d2=new constructor(50,50,50);
		d2.calcu();
		constructor d3=new constructor(50);
		d3.calcu();
		
		
		
			
	}

}
