import static org.junit.Assert.*;

import org.junit.Test;

public class Attack_RobotTester {
	Attack_Robots r = new Attack_Robots ("R", 0, 2, 3, 90);
	
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
		Attack_Robots r2 = new Attack_Robots ("R2", 0, 8, 3, 90);
		r.distance(r2);
		assertTrue("Problem calculating distance", r.distance(r2) == 6);	
	}
	
	@Test
	public void testGetAttackAbility()
	{
		assertTrue("Problem calculating AttackAbility", r.getAttackAbility() == 0);
	}
	
	@Test
	public void testGain_AttackAbility()
	{
		r.gain_attackAbility();
		assertTrue("Problem gaining AttackAbility", r.getAttackAbility() == 1);
	}
	
	@Test
	public void testLoseAttachAbility()
	{
		r.loseAttackAbility();
		assertTrue("Problem loosing AttackAbility", r.getAttackAbility() == 0);
	}
	
	@Test
	public void testAttack()
	{
		for (int i=0; i<10; i++)
		{
			r.gain_attackAbility();
		}
		assertTrue("Problem gaining AttackAbility", r.getAttackAbility() ==10);
		System.out.println(r.getAttackAbility());
		Attack_Robots r2 = new Attack_Robots ("R2", 0, 8, 3, 90);
		for (int i=0; i<8; i++)
		{
			r2.gain_attackAbility();
		}
		System.out.println(r2.getAttackAbility());
		r.attack(r2);
		System.out.println(r.getAttackAbility());
		System.out.println(r2.getAttackAbility());
	}
	
}