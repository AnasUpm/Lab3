
public class Article extends Publication{
	String name;
	String PageNum;

	Article(){
		
	}
	
	Article(String authorName, String title, String Year,String name, String PageNum){
		super(authorName,title,Year);
		this.name=name;
		this.PageNum=PageNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPageNum() {
		return PageNum;
	}

	public void setPageNum(String pageNum) {
		PageNum = pageNum;
	}
	
	public String toString() {
		return super.toString()+"\nName : "+name+"\nPage Number : "+PageNum;
	}
	
}
