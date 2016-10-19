import static org.junit.Assert.*;

import org.junit.Test;

public class Push_RobotTester {
	Push_Robot r = new Push_Robot ("R", 0, 2, 3, 90);

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
		Push_Robot r2 = new Push_Robot ("R2", 0, 8, 3, 90);
		r.distance(r2);
		assertTrue("Problem calculating distance", r.distance(r2) == 6);	
	}
	
	@Test
	public void testPush()
	{
		Push_Robot r2 = new Push_Robot ("R2", 0, 2, 2, 90);
		r.push(r2);
		System.out.println(r2.getPositionX() +" " + r2.getPositionY());
		assertTrue("Problem pushing", r2.getPositionX() == 0);
		assertTrue("Problem pushing", r2.getPositionY() == 0);
	}

}
