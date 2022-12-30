package laout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PickuprosJtableCell {
	static ArrayList<String> stringArrayList = new ArrayList<>();
		public static <E> void makeArrayList(Object targetcellData){
		stringArrayList.add((String) targetcellData);
			Set<String> s = new LinkedHashSet<String>(stringArrayList);  
			System.out.println(s); 

			if ((String) targetcellData == "Exit") {
				PickuprosJtableCell pjc = new PickuprosJtableCell();
				pjc.readfiler("/home/migoey/git/JAVA_Ex/src/lgs_data/ROS_plate");
			}		
		}
	
	public void readfiler(String readf) {
		try{
			File textDirName = new File(readf); 
				Scanner myReader = new Scanner(textDirName);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
	       myReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
    }
}
