// https://meded.ucsd.edu/clinicalmed/ros.html
package laout;

public class ReturnrosData {
	public static Object[] columnNames() {
		Object[] rosDatacNameOrigin = {
				"Item...","Commit...","Commit...","Commit...","Commit...","Commit...","Commit...","last"
		};  
    	return rosDatacNameOrigin;
	}
	
	public static Object roscrsData() {
        Object[][] roscrsDataOrigin ={
        		{"General",
        			"Fever/chills","Weight change","Fatigue","Night sweats","Anorexia","",""},
        		{"Vision",	
        				"Decreased visual acuity","Blurry vision","Diplopia","Eye pain/discharge","",",",""},
        		{"Head and Neck",
        				1,2,3333,4,5,6,"feeling like a curtain got pulled down"},
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