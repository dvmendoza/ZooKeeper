package zookeeper.project;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The gorilla threw a bananna");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("That was so yummy to my tummy!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("That was a big tree");
		energyLevel -= 10;
	}

}
