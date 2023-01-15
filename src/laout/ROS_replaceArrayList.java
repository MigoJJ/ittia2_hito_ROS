package laout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import lgs_comm.File_cdrw_proc;
import lgs_comm.GetRowNoAt;

public class ROS_replaceArrayList {
	public static void main(ArrayList<String> stringArrayList) throws IOException {

		String fileName = (GetRowNoAt.swd + "/lgs_data/ROS_plate_tmp");
		ROS_replaceArrayList.readfiler(fileName,stringArrayList);
	}
	
	public static void readfiler(String readf,ArrayList<String> stringArrayList) throws IOException {
		try{
			File textDirName = new File(readf); 
				Scanner myReader = new Scanner(textDirName);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
//				System.out.println(data);
					ROS_replaceArrayList.replaceROS(data,stringArrayList);
			}
	       myReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
    }
	public static void replaceROS(String line_data,ArrayList<String> stringArrayList) throws IOException {
//		System.out.println("An method occurred.");

	    for (int i = 0; i < stringArrayList.size(); i++) {
	    	if (line_data.contains(stringArrayList.get(i))) {
   		        line_data = ("  [+] > " + stringArrayList.get(i));
   		     File_cdrw_proc.writeliner(ROS_Enter.currentDir +"/src/lgs_data/31ROS6assessment", line_data);
	    	}
	    }
        File_cdrw_proc.writeliner(GetRowNoAt.swd + "/lgs_data/ROS_plate",line_data);
   
	}
}
