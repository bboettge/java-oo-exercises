
public class Push_Robot extends Robot{
	
	public Push_Robot(String name, int positionX, int positionY, int speed, int orientation)
	{
		super(name, positionX, positionY, speed, orientation);
	}
	
	
	public void returnToMiddle()
	{
		this.positionX = 0;
		this.positionY = 0;
	}
	
	public void push(Push_Robot push_robot)
	{
		if (this.positionX == push_robot.getPositionX() && this.positionY == push_robot.getPositionY())
			{
			push_robot.returnToMiddle();
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
