package Reyvan;

public class StaticNonStatic {
	
	String name1;//instance variable   (global variable) 
	String area1; //instance variable  (global variable) 
	static int i=0; //class variable   (global variable) 
	//see if city name is same then every time passing it to constructor will consume more heap memory
	static String city1="thane";// so by making city1 static we saved heap memory 
	
	StaticNonStatic(String name,String area)
	{
		this.name1=name;
		this.area1=area;
		System.out.println("constructor is called when object is created");
		i++;
		System.out.println(i); //but if you make i non static then second time i will be 1 instead of 2.  
	}
	 public void getAddress() //if you make this method static then name1 in this method will show error.
	 {
		System.out.println(name1+" "+city1);
		
		System.out.println(area1);
	 }
	
	public static void main(String[] args) {
		
		StaticNonStatic sn=new StaticNonStatic("rahul","upvan");
		StaticNonStatic sn1=new StaticNonStatic("nirvan","deccan");
		sn.getAddress();
		sn1.getAddress();
		System.out.println(sn.name1);  
		System.out.println(city1);
	}

}
