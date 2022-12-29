// https://meded.ucsd.edu/clinicalmed/ros.html
package laout;

public class ReturnrosData {
	public static String[] columnNames() {
		String[] rosDatacNameOrigin = {
				"Exit","2","3","1","2","1","123","last"
		};  
    	return rosDatacNameOrigin;
	}
	
	public static Object roscrsData() {
        Object[][] roscrsDataOrigin ={
        		{"General",111,2,3,4,5,6,7},
        		{"Vision",1,222,3,4,5,6,7},
        		{"Head and Neck (H&N)",1,2,3333,4,5,6,7},
        		{"Pulmonary",1,2,3,4,5,6,7},
        		{"Cardiovascular (C/V)",1,2,3,4,5,6,7},
        		{"Gastrointestinal",1,2,3,4,5,6,7},
      			{"Genito-Urinary",1,2,3,4,5,6,7},
        		{"Hematology/Oncology",1,2,3,4,5,6,7},
      			{"Ob/Gyn/Breast",1,2,3,4,5,6,7},
      			{"Neurological",1,2,3,4,5,6,7},
      			{"Endocrine",1,2,3,4,5,6,7},
        		{"Infectious Diseases",1,2,3,4,5,6,7},
      			{"Musculoskeletal",1,2,3,4,5,6,7},
        		{"Mental Health",1,2,3,4,5,6,7},
      			{"Skin and Hair",1,2,3,4,5,6,7},
      			{"Exit",1,2,3,4,5,6,7}
        };  
    	return roscrsDataOrigin;
	}
}