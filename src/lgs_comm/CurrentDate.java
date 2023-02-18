package lgs_comm;

import java.util.*;		
import java.text.*;

public class CurrentDate {
	public static String save_time;
	public static String defineTime() {
	      Date dNow = new Date( );
//	      SimpleDateFormat ft =  new SimpleDateFormat ("yyyy.MM.dd E  hh:mm a ");
	      SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
//	      SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM");
//	      SimpleDateFormat ft = new SimpleDateFormat ("yyyy");

//	      SimpleDateFormat ft = new SimpleDateFormat ("E'요일'  yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      System.out.println("Current Date: " + ft.format(dNow));
	      save_time = ft.format(dNow);
	      return save_time;
	}
}