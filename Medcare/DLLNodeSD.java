package Medcare;

public class DLLNodeSD<T> 
{
  private T info;
  private DLLNodeSD<T> forward, back;
  //private Patient patientInfo;
  private String name, 
	 height, 
	 weight, 
	 //lastappomeint, 
	 //nextappoinment, 
	 illnes;
  
  
//  public DLLNodeSD(T info) {
//	  this.info = info; 
//      forward = null; 
//      back = null;
//      patientInfo = new Patient();
//
//  }

  public DLLNodeSD(T info, String name, String height, String weight, String illnes) {
	    this.info = info; 
	    	 forward = null; 
	    	 back = null;
	    	 this.name = name;
			  this.height = height;
			  this.weight = weight;
			  this.illnes = illnes;
	    	 //patientInfo = new Patient(name, height, weight, illnes);
	  }
  
  
  public void setInfo(T info){this.info = info;}
  public T getInfo(){return info;}
  
  
  
  public void setForward(DLLNodeSD<T> forward){this.forward = forward;}
  public void setBack(DLLNodeSD<T> back){this.back = back;}
  
  
  public DLLNodeSD<T> getForward(){return forward;}
  public DLLNodeSD<T> getBack(){return back;}
  
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
  //public Patient getPatient(){return patientInfo;}
  
}
 
 