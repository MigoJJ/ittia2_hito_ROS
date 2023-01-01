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
        					"Pain","Sores or ulcers in mouth","Change in hearing acuity","Ear pain or discharge",
        					"post nasal drip","hoarseness","Sense of lump/mass (globus) in throat w/swallowing"},
        		{"Pulmonary",
        					"Shortness of breath - @ rest or w/exertion?","Chest pain","Cough","Hemoptysis",
        					"Wheezing","Snoring or stop breathing",7},
        		{"Cardiovascular",
        					"Chest pain (CP) or pressure", "Orthopnea (short of breath lying down)",
        					"Paroxysmal Nocturnal Dyspnea (PND)? - sudden shortness of breath that awakens pt from sleep",
        					"Lower extremity edema","Sudden loss of consciousness (syncope)",
        					"Sense of rapid or irregular heart beat, palpatations","Calf/leg pain/cramps w/ambulation",
        					"Wounds/ulcers in feet"},
        		{"Gastrointestinal",
        					"Heart burn/sub-sternal burning","Abdominal pain","Nausea or Vomiting",
        					"Abdominal swelling or distention","Constipation, Diarrhea or other change in bowel habits",
        					"Jaundice (yellowish coloration of skin)","Vomiting blood (hematemasis)","Black/tarry stools"},
      			{"Genito-Urinary",
        					"Blood in urine","Burning with urination","Urination at night",
        					"Incontinence (unintentional loss of urine)",
        					"Urgency, Frequency","Incomplete emptying","Decreased force of stream","Need to void soon after urinating"},
        		{"Hematology/Oncology",
        						"Fevers", "chills", " cold sweats"," weight loss","Abnormal bleeding/brusing",
        						"New/growing lumps or bumps","Hypercoaguability"		
        						},
        		
      			{"Ob/Gyn/Breast",1,2,3,4,5,6,7},
//Menstrual Hx?
//Sweats?
//Past pregnancies?
//Vaginal Discharge?
//# Sexual partners & type of sexual activity?
//Breast mass, pain or discharge?
//Therapeutic or spontaneous abortions?
//Hx STIs?
		
			{"Neurological",
	      			"Sudden loss of neurological function","Abrupt loss/change in level of consciousness",
	      			"Witnessed seizure activity","Numbness","Weakness","Dizziness","Balance problems","Headache"},
	      	{"Endocrine",
	      			"Polyuria, polydypsia, polyphagia?","Fatigue","Weight loss","Weight gain",5,6,7},
	       {"Infectious Diseases",1,2,3,4,5,6,7},
	      	{"Musculoskeletal",1,2,3,4,5,6,7},
	       {"Mental Health",
	      			"Do you feel sad or depressed much of the time","Alcohol, other substance abuse",
	      			"Anxious much of the time","Memory problems","Confusion",6,7},
	      	{"Skin and Hair",
	      			"Skin eruptions/rashes","Sores that grow and/or don't heal",
	      			"Lesions changing in size, shape, or color","Itching",5,6,7},
	      	{"Exit","Quit","Return","Clear","Restart","....","....","...."}
        };  
    	return roscrsDataOrigin;
	}
}