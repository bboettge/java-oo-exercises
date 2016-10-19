
public class AggressiveBehavior implements RobotBehavior {

	private int attackAbility;
	
	public AggressiveBehavior(int attackAbility)
	{
		this.attackAbility = attackAbility;
	}
	
	@Override		
	public void attack(Attack_Robots r)
	{
		r.loseAttackAbility();
	}
	
	
	@Override
	public void doNextMove(Attack_Robots r) 
	{
		while (r.getAttackAbility() > 0)
		{
			attack(r);
		}
	}

}
