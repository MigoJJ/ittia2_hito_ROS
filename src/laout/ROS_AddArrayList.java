package laout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import lgs_comm.File_cdrw_proc;
import lgs_comm.GetRowNoAt;

public class ROS_AddArrayList extends GetRowNoAt{
static ArrayList<String> stringArrayList = new ArrayList<>();
	public static void main(String getCellValue, int row, int column) {
		try {
			if ((String) getCellValue == "Exit") {
//			System.out.println(stringArrayList); 
			ROS_replaceArrayList.main(stringArrayList);
			File_cdrw_proc fcp1= new File_cdrw_proc(); 
			
		// write to 6SUJ
			fcp1.copyfiler(swd + "/lgs_data/ROS_plate", swd + "/lgs_data/31ROS");
		// file clearing
					fcp1.deletefiler(swd + "/lgs_data/ROS_plate");
					fcp1.deletefiler(swd + "/lgs_data/ROS_plate_tmp");
					fcp1.checkfiler(swd + "/lgs_data/ROS_plate");
					fcp1.checkfiler(swd + "/lgs_data/ROS_plate_tmp");
		}else {
		       if(column==0) {
					GetRowNoAt.getIndexRow(row);
		       }else {
			   		stringArrayList.add(getCellValue);
//			   		Set<String> s = new LinkedHashSet<String>(stringArrayList); 
//			   		System.out.println(s); 
		        }
		}
		} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
	}
}
