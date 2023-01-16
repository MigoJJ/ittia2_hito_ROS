package lgs_comm;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 
public class CleanDir {
   public static String currentDir = System.getProperty("user.dir");
    public static void deleteDirectory(File directory) throws IOException {
        Files.walk(directory.toPath())
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .forEach(File::delete);
    }
    
	public static void copy_Directory(String ladir, String nudir) throws IOException {
		try {
			File_cdrw_proc da1 = new File_cdrw_proc();
			List<String> list=new ArrayList<String>();  
			  list.add("/31ROS");  
			  list.add("/31ROS6assessment");  
			  list.add("/ROS_plate");  
			  list.add("/ROS_plate_tmp");  
//			  list.add("/9PLAN");
	
			  for(String fruit:list)
					da1.copyfiler(ladir +fruit, nudir+ fruit );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 
    public static void main(String[] args) throws IOException {
		File directory = new File(currentDir +"/lgs_data");
//		deleteDirectory(directory);
		
		 String a = (currentDir + "/tmp") ;
		 String b = (currentDir+ "/src/lgs_data") ;
		 copy_Directory(a,b);
    }
}