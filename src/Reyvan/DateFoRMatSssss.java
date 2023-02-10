package Reyvan;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFoRMatSssss {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.toString());
		System.out.println("***********");
		SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy  hh:mm:ss");
		sdf.format(d);
		System.out.println(sdf.format(d));
										       		/* M=month
													  d=date
													  yyyy=year
													  H =0~23 hour
													  h=0~12 p.m./am
													  s=seconds
													  S=milliseconds
													 
													 */
		
		Calendar cal=Calendar.getInstance();
		System.out.println(	cal.get(Calendar.DAY_OF_MONTH));
	
		System.out.println();
		
		

	}

}
