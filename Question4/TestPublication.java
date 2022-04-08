
public class TestPublication {
	public static void main(String[] args) {
		
		
		Publication p = new Publication("Raihan","Pubpub","2009");
		Book b = new Book("Rohani","fabpub","2029","2nd Edition","FeelsGoodPub");
		Article A =new Article("Farook","Tabtub","3009","Testimoni Asas","30-32");
		TechnicalReport techRep = new TechnicalReport("kamal","kangKung","2009","Universiti of Universe","230001");
		
		
		
		System.out.println(p);
		System.out.println("-------------------------------------------");
		System.out.println(b);
		System.out.println("-------------------------------------------");
		System.out.println(A);
		System.out.println("-------------------------------------------");
		System.out.println(techRep);
		System.out.println("-------------------------------------------");
	}
}
