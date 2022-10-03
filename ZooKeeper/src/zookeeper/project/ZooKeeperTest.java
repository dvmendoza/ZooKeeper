package zookeeper.project;

public class ZooKeeperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal mamm = new Mammal();
		Gorilla gs = new Gorilla();
		Bat bs = new Bat();
		
		gs.displayEnergyLevel();
		mamm.displayEnergyLevel();
		gs.throwSomething();
		gs.displayEnergyLevel();
		gs.eatBananas();
		gs.displayEnergyLevel();
		gs.climb();
		gs.displayEnergyLevel();
		bs.fly();
		int batEnergy = bs.displayEnergyLevel();
		System.out.println(batEnergy);
		bs.eatHumans();
		int batEat = bs.displayEnergyLevel();
		System.out.println(batEat);
		bs.attackTown();
		int batAttack = bs.displayEnergyLevel();
		System.out.println(batAttack);
	}

}
