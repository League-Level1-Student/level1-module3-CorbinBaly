import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World world = new World();
	Bug redbug = new Bug();
	Bug bluebug = new Bug();
	Flower flower = new Flower();
	Random rand = new Random();
	int random = rand.nextInt(10);
	Location locationone = new Location(1,1);
	Location locationrand = new Location(random,random);
	world.show();
	world.add(locationone, redbug);
	world.add(locationrand, bluebug);
	
	
}
}
