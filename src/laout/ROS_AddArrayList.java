package laout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import lgs_comm.GetRowNoAt;

public class ROS_AddArrayList {
static ArrayList<String> stringArrayList = new ArrayList<>();
	public static void main(String getCellValue, int row, int column) {
		try {
			if ((String) getCellValue == "Exit") {
//			System.out.println(stringArrayList); 
			ROS_replaceArrayList.main(stringArrayList);
			
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
