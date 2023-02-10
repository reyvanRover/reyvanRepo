package Reyvan;

public class characterCount {

	public static void main(String[] args) {
		
		String a="i&love&range&rover&autobiography";
		String [] M=a.split("&");
		for(int i=0;i<M.length;i++)
		{
			String Tata=M[i];
		
		System.out.println(Tata.length());
		}

	}

}
