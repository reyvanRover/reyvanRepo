package Reyvan;

public class concreteRD extends abstract1 {
	
	
	
     public void rd3()
     {
    	 System.out.println("halo re halo");
     }
	public static void main(String[] args) 
	{
		concreteRD obj=new concreteRD();
		abstract1 a=new concreteRD();
		
		obj.rd3();
		obj.rd1();
		obj.rd3();
		rd2();
	}

}
