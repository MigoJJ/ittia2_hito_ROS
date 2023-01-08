package laout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import lgs_comm.File_cdrw_proc;

public class PickuprosJtableCell {
	static ArrayList<String> stringArrayList = new ArrayList<>();
		public static <E> void makeArrayList(Object targetcellData) throws IOException{
			stringArrayList.add((String) targetcellData);
			Set<String> s = new LinkedHashSet<String>(stringArrayList);  
			
			System.out.println(s); 
			
			if ((String) targetcellData == "Exit") {
				
			}		
			PickuprosJtableCell_chagne.main(s);
		}
}
