package zookeeper.project;

public class ZooKeeperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal mamm = new Mammal();
		Gorilla gs = new Gorilla();
		gs.displayEnergyLevel();
		mamm.displayEnergyLevel();
		gs.throwSomething();
		gs.displayEnergyLevel();
		gs.eatBananas();
		gs.displayEnergyLevel();
		gs.climb();
		gs.displayEnergyLevel();

	}

}
