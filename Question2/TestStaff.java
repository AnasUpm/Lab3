import java.util.Scanner;

public class TestStaff {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Directly insert parameter method
//		Staff S = new Staff("AB001","Mahmud Yanam","Mahmud@gmail.com","D4S54");
//		Academic A = new Academic("AA002","Suzilah MdNor","Suzilah@gmail.com","F2E54","Associate Professor Dr.");
//		NonAcademic NA = new NonAcademic("AN003","Jamilah Jamal","Jamilah@gmail.com","J1S53","Secretary");
//		Staff SA = new Academic("AA041","Faizul Hanafi","PejolKiyut@gmail.com","A2S54","Senior Lecturer");
//		Staff SNA = new NonAcademic("AN005","Hanif Jamal","BRGSJK@gmail.com","B2F54","Technical Assistant");
//		
//		System.out.println("Staff : ");
//		System.out.println(S);
//		System.out.println("-------------------------------------------");
//		System.out.println("Academic Staff : ");
//		System.out.println(A);
//		System.out.println("-------------------------------------------");
//		System.out.println("Non-Academic Staff : ");
//		System.out.println(NA);
//		System.out.println("-------------------------------------------");
//		System.out.println("Academic Staff : ");
//		System.out.println(SA);
//		System.out.println("-------------------------------------------");
//		System.out.println("Non-Academic Staff : ");
//		System.out.println(SNA);
//		System.out.println("-------------------------------------------");
		
		//user input method
		int i;
		int j=0;
		int x=0;
		int y=0;
		
		Staff[] staff = new Staff[10];
		Academic[] academic = new Academic[10];
		NonAcademic[] Nacademic = new NonAcademic[10];
		Staff[] Astaff = new Academic[10];
		
		
		do {
			System.out.println("--------------------------");
			System.out.println("|enter 1 for Staff|\n|2 for Academic Staff|\n|3 for Non-Academic Staff|\n|0 to exit|");
			System.out.println("--------------------------");
			i = scan.nextInt();
			
			if(i==1) {
				staff[j] = new Staff();
				System.out.println("Enter Staff ID ");
				staff[j].setStaffId(scan.next());
				System.out.println("Enter Name ");
				staff[j].setName(scan.next());
				System.out.println("Enter Email ");
				staff[j].setEmail(scan.next());
				System.out.println("Enter Grade ");
				staff[j].setGrade(scan.next());
				System.out.println(staff[j].toString());
				j++;
			}
			else if(i==2) {
				academic[x] = new Academic();
				System.out.println("Enter Staff ID ");
				academic[x].setStaffId(scan.next());
				System.out.println("Enter Name ");
				academic[x].setName(scan.next());
				System.out.println("Enter Email ");
				academic[x].setEmail(scan.next());
				System.out.println("Enter Grade ");
				academic[x].setGrade(scan.next());
				System.out.println("Enter Title ");
				academic[x].setTitle(scan.next());
				System.out.println(academic[x].toString());
				x++;
			}
			else if(i==3) {
				Nacademic[y] = new NonAcademic();
				System.out.println("Enter Staff ID ");
				Nacademic[y].setStaffId(scan.next());
				System.out.println("Enter Name ");
				Nacademic[y].setName(scan.next());
				System.out.println("Enter Email ");
				Nacademic[y].setEmail(scan.next());
				System.out.println("Enter Grade ");
				Nacademic[y].setGrade(scan.next());
				System.out.println("Enter Position ");
				Nacademic[y].setPosition(scan.next());
				System.out.println(Nacademic[y].toString());
				y++;
			}
		
			
		}while(i!=0);
		
		System.out.println("||LIST OF STAFF||");
		System.out.println("--------------------------------");
		for(i=0; i<j;i++) {
			System.out.println((i+1)+". "+ staff[i].toString());
			System.out.println("");
		}
		System.out.println("--------------------------------");
		
		System.out.println("||LIST OF ACADEMIC STAFF||");
		System.out.println("--------------------------------");
		for(i=0; i<x;i++) {
			System.out.println((i+1)+". "+staff[i].toString());
			System.out.println("");
		}
		System.out.println("--------------------------------");
		
		System.out.println("||LIST OF NON-ACADEMIC STAFF||");
		System.out.println("--------------------------------");
		for(i=0; i<y;i++) {
			System.out.println((i+1)+". "+staff[i].toString());
			System.out.println("");
		}
		System.out.println("--------------------------------");
		
		
		

	}

}
