
public class Publication {
	
	String authorName;
	String title;
	String Year;
	
	Publication(){
		
	}
	
	Publication(String authorName, String title, String Year){
		this.authorName=authorName;
		this.title=title;
		this.Year=Year;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}
	
	public String toString () {
		return getClass().getName()+"\nAuthor's Name : "+authorName+"\nTitle : "+title+"\nYear : "+Year;
	}

}
