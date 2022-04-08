
public class Person {
	private String name;
	private String address;
	private String phoneNum;
	private String email;
	
	Person(){}
	
	Person(String name, String address, String phoneNum, String email){
		this.address=address;
		this.email=email;
		this.name=name;
		this.phoneNum=phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return getClass().getName()+"\n|Name : "+name+"| Address : "+address+"| phone number : "+phoneNum+"| Email : "+email+"|";
	}
}
