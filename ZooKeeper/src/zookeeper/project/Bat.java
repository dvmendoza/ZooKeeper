package zookeeper.project;

public class Bat extends Mammal {
	
	public int energyLevel = 300;
	
	@Override
	public int displayEnergyLevel() {
		return this.energyLevel;
	}
	
	public void fly() {
		System.out.println("No sound, its quiet");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Blood, blood, blood");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Fire, fire, fire");
		energyLevel -= 100;
	}

}
