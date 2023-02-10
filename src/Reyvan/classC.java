package Reyvan;

public class classC {
	
	
     public static String demo3()
     {
    	 String s="Range Rover";
    	 return s;
     }
	public static void main(String[] args) 
	{
		//classA.demo1();
		//classB.demo2();
		//classC.demo3();
		
		classA.demo1().demo2().demo3();  //this is called method chaining
		                                 // example:driver.manage().window().maximize();
	                      //but in above example you have used object driver but methods in classA classB classC are static so we dont 
	                      //object for calling static method we use classname.methodname()
	}
	

}
