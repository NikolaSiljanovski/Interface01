
public class MammalInt implements Animal {

	@Override
	public void eat() {
		System.out.println("Mammal eats");
		
	}

	@Override
	public void travel() {
		System.out.println("Mammal travel");
	}

	public int noOfLegs() {
		return 0;
	}
	
	
}
