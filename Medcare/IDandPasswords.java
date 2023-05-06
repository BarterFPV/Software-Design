package Medcare;   

import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo_d = new HashMap<String,String>();
	static DEQueueSD<String> patients = new DEQueueSD<String>();
	
	IDandPasswords(){
		patients.enqueueFrontDis("13342", "Miguel", "5'5", "170", "Healthy");
		patients.enqueueFrontDis("28875", "Barter", "5'5", "160", "Healthy");
		patients.enqueueFrontDis("92777", "Jonah", "6'0", "180", "Healthy");
		
		
		logininfo_d.put("Barter","perez");
	}
	
	public HashMap getDocLoginInfo(){
		return logininfo_d;
	}
	
	public DEQueueSD<String> getLoginInfo(){
		return patients;
	}
}
