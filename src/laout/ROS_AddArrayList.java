package laout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import lgs_comm.GetRowNoAt;

public class ROS_AddArrayList {

	public static void main(String getCellValue, int row, int column) {
     	 
    try {
      ArrayList<String> stringArrayList = new ArrayList<>();
		stringArrayList.add(getCellValue);
		Set<String> s = new LinkedHashSet<String>(stringArrayList); 
		System.out.println(s); 

		if ((String) getCellValue == "Exit") {
			
		}else {
		       if(column==0) {
					GetRowNoAt.getIndexRow(row);
		       }else {     
		        }
		}
		} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
