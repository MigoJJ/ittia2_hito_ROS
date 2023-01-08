package lgs_comm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import laout.JTGSCells;

public class GetRowNoAt extends JTGSCells{
	public static void getIndexRow(int row) throws IOException{
		File_cdrw_proc pjc = new File_cdrw_proc();
		int column = 0;
				
		for (int i = 0; i < 8; i++) {
			String rcgetCellValue = (String) table.getModel().getValueAt(row, i);
			if (i==0) {
				rcgetCellValue = "[..." + rcgetCellValue + "...]";
				System.out.println(rcgetCellValue);
				pjc.writeliner("/home/migoey/git/GDS_rosReturn/src/lgs_data/ROS_plate_tmp", rcgetCellValue);
			}	
			else{
				if (Arrays.asList("1", "2", "3", "4","5","6","7","",",").contains(rcgetCellValue)) {
					continue;
					}
				 else {
				 System.out.println("  [-] "+ rcgetCellValue);
				 pjc.writeliner("/home/migoey/git/GDS_rosReturn/src/lgs_data/ROS_plate_tmp","  [-] "+ rcgetCellValue);
				 }
			}
        }
	}
}