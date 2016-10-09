import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTester {
	Robot r = new Robot ("R", 0, 2, 3, 90);
	
	@Test
	public void testGetName() 
	{
		assertTrue("Problem setting name in constructor", r.getName() == "R");
	}
	
	@Test
	public void testGetPositionX() 
	{
		assertTrue("Problem setting x coordinate", r.getPositionX() == 0);
	}
	
	@Test
	public void testGetPositionY() 
	{
		assertTrue("Problem setting x coordinate", r.getPositionY() == 2);
	}
	
	@Test
	public void testGetSpeed()
	{
		assertTrue("Problem setting speed", r.getSpeed() == 3);
	}
	
	@Test
	public void testGetOrientation()
	{
		assertTrue("Problem setting orientation", r.getOrientation() == 90);
	}
	
	@Test
	public void testMove()
	{
		r.move(4);
		assertTrue("Problem with move x coordinate", r.getPositionX() == 12);
		assertTrue("Problem with move y coordinate", r.getPositionY() == 2);
	}
	
	@Test
	public void testRotate()
	{
		r.rotate(180);
		assertTrue("Problem with rotating", r.getOrientation() == 270);
	}
	
	@Test
	public void testDistance()
	{
		Robot r2 = new Robot ("R2", 0, 8, 3, 90);
		r.distance(r2);
		assertTrue("Problem calculating distance", r.distance(r2) == 6);
		
	}
}
