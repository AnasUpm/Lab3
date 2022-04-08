
public class Student extends Person
{
	
	final String[] status = {"freshman","sophmore","junior","senior"};
	private String Stat = "freshman";
	Student(){}
	
	Student (String name, String address, String phoneNum, String email,int Status){
		super(name, address,phoneNum,email);
		if(Status  == 1) {
			
			Stat= this.status[0];
		}
		if(Status  == 2) {
			Stat= this.status[1];
		}
		if(Status  == 3) {
			Stat= this.status[2];
		}
		if(Status  == 4) {
			Stat= this.status[3];
		}
	}
	
	public String toString() {
		
		return super.toString()+"| Status : "+Stat+"|";
	}

}
