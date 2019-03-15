import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World world = new World();
	for (int row = 0; row < 10; row++) {
		for (int col = 0; col < 10; col++) {
			Flower flower = new Flower();
			Location location = new Location(row,col);
			world.add(location, flower);
		}
	}
	Bug redbug = new Bug();
	Bug bluebug = new Bug(Color.blue);
	Flower rightflower = new Flower();
	Flower leftflower = new Flower();
	bluebug.turn();
	bluebug.turn();
	Random randFlowerOne = new Random();
	int randomOne = randFlowerOne.nextInt(10);
	Random randTwo = new Random();
	int randomTwo = randTwo.nextInt(10);
	Location locationone = new Location(1,1);
	Location locationrand = new Location(randomOne,randomTwo);
	Location locationflowerOne = new Location(randomOne,randomTwo+1);
	Location locationflowerTwo = new Location(randomOne,randomTwo-1);
	world.show();
	world.add(locationone, redbug);
	world.add(locationrand, bluebug);
	world.add(locationflowerOne, rightflower);
	world.add(locationflowerTwo, leftflower);
	
	
}
}
