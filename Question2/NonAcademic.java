
public class NonAcademic extends Staff {

	String position;
	
	NonAcademic(){
		
	}
	
	NonAcademic(String staffId,String name,String email,String Grade,String position){
		super(staffId,name,email,Grade);
		this.position=position;
		
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public String toString() {
		return super.toString()+"\nPosition : "+position;
	}
	
}
