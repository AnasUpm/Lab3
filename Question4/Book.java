
public class Book extends Publication{
	
	String edition;
	String publisher;
	
	Book(){
		
	}
	
	Book(String authorName, String title, String Year,String edition,String publisher){
		super(authorName,title,Year);
		this.edition=edition;
		this.publisher=publisher;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String toString() {
		return super.toString()+"\nEdition : "+edition+"\nPublisher : "+publisher;
	}

}
