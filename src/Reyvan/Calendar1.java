package Reyvan;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar1 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		
		System.out.println(cal.getTime());
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss:a");
		
		System.out.println(sdf.format(cal.getTime()));
		
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
				

	}

}
