package Reyvan;

import java.util.ArrayList;
import java.util.List;

public class printEvenNumberfromlist {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(1);list.add(12);
	list.add(41);list.add(15);
	list.add(22);list.add(89);
		for(int i:list)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}
