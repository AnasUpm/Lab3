
public class TechnicalReport extends Publication{
	
	String address;
	String reportNum;
	
	TechnicalReport(){
		
	}
	
	TechnicalReport(String authorName, String title, String Year,String address, String reportNum){
		super(authorName,title,Year);
		this.address=address;
		this.reportNum=reportNum;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getReportNum() {
		return reportNum;
	}

	public void setReportNum(String reportNum) {
		this.reportNum = reportNum;
	}
	
	public String toString() {
		return super.toString()+"\nAddress//Institution of Author : "+address+"\nReport Number : "+reportNum;
	}

}
