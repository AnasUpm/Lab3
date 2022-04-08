
public class Staff extends Employee {
	private String title;
	
	Staff(String name, String address, String phoneNum, String email, String office, double salary, String title) {
		super(name, address, phoneNum, email, office, salary);
		this.title=title;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		
		return (super.toString()+"| Title : "+title+"|");
	}

}
