package Reyvan;

 class implementsSon implements interfaceFather1,interfaceFather2 { // we are linking this class with interface hence using implements keyword
	  
	 
	 
	 public void rd3()
	 {
		 System.out.println(" this method only in implements class");
	 }
	 
	
	public String rd4()
	{
		String a="tata";
		System.out.println(a);
		return a;
	}
	
	public void rd5()
	  {
		int x=6;
		double y=x;
		 double a=50.56955;
		 int b=(int)a;
		
		  System.out.println("what?"+y +" "+ b);
	  }

	public static void main(String[] args) {
		implementsSon obj= new implementsSon();
		obj.rd5();
		obj.rd4();
	

	}

}
