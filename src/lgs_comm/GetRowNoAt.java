package lgs_comm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import laout.ROS_Enter;

public class GetRowNoAt extends ROS_Enter{
	public GetRowNoAt() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void getIndexRow(int row) throws IOException{
		System.out.println(swd);
		File_cdrw_proc pjc = new File_cdrw_proc();
		int column = 0;
		for (int i = 0; i < 8; i++) {
			String rcgetCellValue = (String) table.getModel().getValueAt(row, i);
			if (i==0) {
				rcgetCellValue = "..." + rcgetCellValue + "...";
				System.out.println(rcgetCellValue);
				pjc.writeliner(swd +"/lgs_data/ROS_plate_tmp", rcgetCellValue);
			}	
			else{
				if (Arrays.asList("1", "2", "3", "4","5","6","7","",",").contains(rcgetCellValue)) {
					continue;
					}
				 else {
				 System.out.println("  [-] "+ rcgetCellValue);
				 pjc.writeliner(swd + "/lgs_data/ROS_plate_tmp","  [-] "+ rcgetCellValue);
				 }
			}
		}
	}
}