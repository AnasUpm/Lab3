
public class TestBird {

	public static void main(String[] args) {
		Cat C = new Cat();
		Dog D = new Dog();
		Bird B = new Bird();
		Pet P = new Dog(); //superclass reference
		
		
		//display output
		System.out.println(C.getClass().getName());
		C.PetType();
		C.PetAction();   //check if can take the method from parent class
		System.out.println("-------------------------------------------");
		System.out.println(D.getClass().getName());
		D.PetType();
		D.PetAction();
		System.out.println("-------------------------------------------");
		System.out.println(B.getClass().getName());
		B.PetType();
		B.LiketoEat();
		System.out.println("-------------------------------------------");
		System.out.println(P.getClass().getName());
		P.PetType();
		P.PetAction();
		System.out.println("-------------------------------------------");

	}

}
