// https://meded.ucsd.edu/clinicalmed/ros.html
package laout;

public class ReturnrosData {
	public static String[] columnNames() {
		String[] rosDatacNameOrigin = {
				"Commit...","2","3","4","5","6","7","last"
		};  
    	return rosDatacNameOrigin;
	}
	
	public static Object roscrsData() {
        Object[][] roscrsDataOrigin ={
        		{"General","111",2,3,4,5,6,7},
        		{"Vision",1,222,3,4,5,6,"recent trauma"},
        		{"Head and Neck",1,2,3333,4,5,6,"feeling like a curtain got pulled down"},
        		{"Pulmonary",1,2,3,4,5,6,7},
        		{"Cardiovascular",1,2,3,4,5,6,7},
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
      			{"Exit","Quit","Return","Clear","Restart","....","....","...."}
        };  
    	return roscrsDataOrigin;
	}
}