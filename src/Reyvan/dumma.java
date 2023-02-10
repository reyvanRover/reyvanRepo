package Reyvan;

public class dumma {

	public static void main(String[] args) {
	dumma2 n=new dumma2(); 
	n.setage(28);
	//System.out.println(age); //directly you cant access age as age is private in dumma class
	System.out.println(n.getage());//hence we have return getter method to access age 
                                    //this is called encapsulation
	}

}
