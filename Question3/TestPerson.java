
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("supian","melaka","0192283901","pianmakbur@gmail.com");
		Person s = new Student("Faris","johor","0193323901","FarisFArisS@gmail.com",2);
		Person e = new Employee("Intan","Perak","0123483201","IntanSazlin@gmail.com","Accounting",1500);
		Person f = new Faculty("Muhammad","Kedah","0132413901","MahmudSamad@gmail.com","Network",2000,"9.00am-9.00p.m","Worker");
		Person st = new Staff("Pak Tam","Kelantan","0111383941","TamTamMM@gmail.com","Cleaning",200,"noTitle");
		Employee a = new Employee("Amisha","Pahang","0123432131","Amishaeee@gmai.com","Management",1500);
		
		
		a.getDateHired().setDay(20);
		a.getDateHired().setMonth(2);
		a.getDateHired().setYear(2009);
		
		
		System.out.println(p.toString());
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(s.toString());
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(e.toString());
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(f.toString());
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(st.toString());
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(a.toString());
		System.out.println("-----------------------------------------------------------------------------------------");
	}

}
