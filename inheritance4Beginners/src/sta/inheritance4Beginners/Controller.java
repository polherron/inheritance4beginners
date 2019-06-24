package sta.inheritance4Beginners;

public class Controller {

	public static void main(String[] args) {

		Pet myPet = new Pet(1, "Mickey", "21/06/2019", false, 300);
		
		Dog myDog = new Dog(2, "Pluto", "21/06/2019", false, 300);
		
		System.out.println(myPet.toString());
		System.out.println(myDog.toString());
		System.out.println(myDog.feedingInstructions());
	}
}
