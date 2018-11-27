import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
	static World world = new World();
	static Bug bug = new Bug();
	static Bug bug2 = new Bug();
	static Flower flower = new Flower();
	static Location loc = new Location(1,1);
	static Random rand = new Random();
	static Location loc2;
	static Location loc3;
	static Location loc4;
	static Location loc5;
	static int bugX;
	static int bugY;
	static int flowerX;
	static int flowerY;
	
	public static void main(String[] args) {
		
		world.show();
		world.add(loc, bug);
		bug2.setColor(Color.CYAN);
		bugX = rand.nextInt(10);
		bugY = rand.nextInt(10);
		bugX = bugX + 1;
		bugY = bugY + 1;
		loc2 = new Location(bugX, bugY);
		loc3 = new Location(bugX, bugY + 1);
		loc4 = new Location(bugX, bugY - 1);
		world.add(loc2, bug2);
		bug2.turn();
		bug2.turn();
		
		world.add(loc3, flower);
		world.add(loc4, flower);
		
		for (int i = 0; i < 300; i++) {
			flowerX = rand.nextInt(10);
			flowerY = rand.nextInt(10);
			loc5 = new Location(flowerX, flowerY);
			world.add(loc5, flower);
		}
		
		
		
		
	}
}
