package laout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import lgs_comm.File_cdrw_proc;
import lgs_comm.GetRowNoAt;

public class PickuprosJtableCell {
	static ArrayList<String> stringArrayList = new ArrayList<>();
		public static <E> void makeArrayList(Object targetcellData) throws IOException{
		stringArrayList.add((String) targetcellData);
			Set<String> s = new LinkedHashSet<String>(stringArrayList);  
			System.out.println(s); 

			if ((String) targetcellData == "Exit") {
				File_cdrw_proc pjc = new File_cdrw_proc();
				pjc.writeliners("/home/migoey/git/JAVA_Ex/src/lgs_data/ROS_plate_tmp",s);
			}		
			
			PickuprosJtableCell_chagne.main(s);
		}
}
