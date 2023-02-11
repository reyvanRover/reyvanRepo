package Reyvan;

public class StringSplit {

	public static void main(String[] args) {
		String s="Use this temporary password 'revan4321' for login.";
		String[] passwordArray=s.split("'");  //{Use this temporary password,revan4321' for login.}
		
		
		
		
		//String a=passwordArray[1];   //a=revan4321' for login.this line just for understanding
		//String []b=passwordArray[1].split("'");
		//String password=b[0];
		//System.out.println(password);
		             //OR*OR*OR//
		String password=passwordArray[1].split("'")[0];
		System.out.println(password);
		

	}

}
