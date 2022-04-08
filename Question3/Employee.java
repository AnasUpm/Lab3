import java.util.Date;

public class Employee extends Person  {
	
	private String office;
	private double salary;
	MyDate dateHired;
	
	Employee(){
		this("farish", "addres", "phoneNum"," email", "office", 2000);
	}
	
	Employee(String name, String address, String phoneNum, String email,String office,double salary){
		
		super(name,address,phoneNum,email);
		dateHired=new MyDate(2000,10,9);
		this.office=office;
		this.salary=salary;
		
	}
	
	public MyDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
		
	}

	public String toString() {
		return super.toString()+"\n|Office : "+office+"| Salary : "+salary+"| Date Hired : "+dateHired+"|";
	}

}
