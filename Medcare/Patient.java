package Medcare;

import java.util.Scanner;

public class Patient {
	  private String name, 
	  				 height, 
	  				 weight, 
	  				 //lastappomeint, 
	  				 //nextappoinment, 
	  				 illnes;

//	  public Patient() {
//		  Scanner input = new Scanner(System.in);
//		  String userInput;
//		
//		  
//		  System.out.println("Patient's name?");
//		  userInput = input.next();
//		  name = userInput;
//		  
//		  System.out.println("Patient's height?");
//		  userInput = input.next();
//		  height = userInput;
//		  
//		  System.out.println("Patient's weight?");
//		  userInput = input.next();
//		  weight = userInput;
//		  
//		  System.out.println("Patient's illnes?");
//		  userInput = input.next();
//		  illnes = userInput;
//		  
//		  //input.close();
//	  }
	  
	  public Patient(String name, String height, String weight, String illnes) {
		  this.name = name;
		  this.height = height;
		  this.weight = weight;
		  this.illnes = illnes;
	  }
	  
	  public void setName (String name){this.name = name;}
	  public void setHeight (String height){this.height = height;}
	  public void setWeight (String weight){this.weight = weight;}
	  //public void setLastappomeint (String lastappomeint){this.lastappomeint = lastappomeint;}
	  //public void setNextappoinment (String nextappoinment){this.nextappoinment = nextappoinment;}
	  public void setIllnes (String illnes){this.illnes = illnes;}
	  
	  
	  public String getName(){return name;}
	  public String getHeight(){return height;}
	  public String getWeight(){return weight;}
	  //public String getLastappomeint(){return lastappomeint;}
	  //public String getNextappoinment(){return nextappoinment;}
	  public String getIllnes(){return illnes;}

}
