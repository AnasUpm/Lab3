
public class Faculty extends Employee {

	private String officeHours;
	private String rank;
	
	Faculty(){
		
	}
	
	Faculty(String name, String address, String phoneNum, String email, String office, double salary,String officeHours,String rank) {
		super(name, address, phoneNum, email, office, salary);
		this.officeHours=officeHours;
		this.rank=rank;
		
	}

	@Override
	public String toString() {
		return (super.toString()+"| Office Hours : "+officeHours+"| Rank : "+rank+"|");
	}
	

}
