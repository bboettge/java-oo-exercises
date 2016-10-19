
public class Attack_Robots extends Robot{

	private int attackAbility;
	
	public Attack_Robots(String name, int positionX, int positionY, int speed, int orientation)
	{
		super(name, positionX, positionY, speed, orientation);
		this.attackAbility = 0;	
	}
	
	public int getAttackAbility()
	{
		return this.attackAbility;
	}
	
	public void gain_attackAbility()
	{
		this.attackAbility = this.attackAbility + 3;
	}
	
	public void loseAttackAbility()
	{
		if (this.attackAbility > 0) 
		{
			this.attackAbility = this.attackAbility -1;
		}
	}
	
	public void attack(Attack_Robots attack_robot)
	{
		if (this.attackAbility == attack_robot.getAttackAbility())
		{
			loseAttackAbility();
			attack_robot.loseAttackAbility();
		}
		else if (this.attackAbility > attack_robot.getAttackAbility())
		{
			gain_attackAbility();
			attack_robot.loseAttackAbility();
		}
		else
		{
			loseAttackAbility();
			attack_robot.gain_attackAbility();
		}
		
	}
	
	public void setBehavior(String RobotBehavior)
	{
		this.behavior = RobotBehavior;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attack_Robots r = new Attack_Robots("Bram", 0, 0, 2, 90);
		r.setBehavior("AggressiveBehavior");
		Attack_Robots ar = new Attack_Robots("Melissa", 0, 0, 2, 90);
		ar.setBehavior("DeffensiveBehavior");
		ar.gain_attackAbility();
		ar.gain_attackAbility();
		System.out.println(ar.getAttackAbility());
		r.gain_attackAbility();
		System.out.println(r.getAttackAbility());
		r.doNextMove(ar);
		
		
		
	}

}
