package Reyvan;

public class sonCasting extends fatherCasting { // brought properties of fatherCasting class here
	
	void car()
	{
		System.out.println("range rover");
	}
	 void bike()
	{
		System.out.println("honda dio");
	}
     void degree()
	{
	System.out.println("BE");
	}

	public static void main(String[] args) {
		
		sonCasting s= new sonCasting();
				s.car();
		        s.bike();
		       s.degree();             
		       System.out.println("**************************");
		
		 fatherCasting f= new sonCasting();//putting properties of sonCasting into fatherCasting
		// sonCasting t = new fatherCasting();  //see this will give you error hence we written in line 29 & 30
		 
//		 sonCasting t=(sonCasting)f;  ///this is down casting but observe first we have to do up casting to get f;
//		 t.bike();
		 
		
		f.car();   //inherited from fatherCasting and common in both
		f.bike();  //inherited from fatherCasting and common in both
		f.home();  //inherited from fatherCasting but not common.hence father class method output is printed observe.
		//f.degree();// giving error bcoz degree is not inherited from fatherCasting into sonCasting
	}

}
