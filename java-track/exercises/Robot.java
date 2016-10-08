
public class Robot {
	
	//Fields:
	
	private String name;
	private int positionX;
	private int positionY;
	private int speed;
	private int orientation;
	
	//Behaviors
	
	//Create a robot
	public Robot(String name, int positionX, int positionY, int speed, int orientation)
	{
		this.name = name;
		this.positionX = positionX;
		this.positionY = positionY;
		this.speed = speed;
		this.orientation = orientation;
	}
		
	//Get name
	public String getName()
	{
		return this.name;
	}
	
	//Get PositionX
	public int getPositionX()
	{
		return this.positionX;
	}
	
	//Get PositionY
		public int getPositionY()
		{
			return this.positionY;
		}
	
	//Get Speed
	public int getSpeed()
	{
		return this.speed;
	}
	
	//Get Orientation
	public int getOrientation()
	{
		return this.orientation;
	}
	
	//Move
	public void move(int moveAmt)
	{
		if(this.orientation == 0)
		{
			this.positionY = this.positionY + (this.speed * moveAmt);
		}
		if(this.orientation == 90)
		{
			this.positionX = this.positionX + (this.speed * moveAmt);
		}
		if(this.orientation == 180)
		{
			this.positionY = this.positionY - (this.speed * moveAmt);
		}
		if(this.orientation == 270)
		{
			this.positionX = this.positionX - (this.speed * moveAmt);
		}
	}
	
	//Rotate
	public void rotate(int rotationAmt)
	{
		this.orientation = this.orientation + rotationAmt;
	}
	
	//Determine distance from other robot
	public double distance(Robot robot)
	{
		double distanceY = this.positionY - robot.getPositionY();
		double distanceX = this.positionX - robot.getPositionX();
		double distanceSqr = (distanceY * distanceY) + (distanceX * distanceX);
		return Math.sqrt(distanceSqr);
	}
	
	
	//Display as String
	public String toString()
	{
		return "Name: " + this.name + ", X Coordinate: " + this.positionX + ", Y Coordinate: " + this.positionY + ", Speed: " + this.speed + ", Orientation: " + this.orientation + " Degrees";
	}
	
	

	public static void main(String args[]) 
	{
		Robot myRobot = new Robot("Bram", 0, 0, 2, 0);
		System.out.println(myRobot.toString());
		Robot yourRobot = new Robot("Melissa", 0, 0, 3, 0);
		System.out.println(yourRobot.toString());
		myRobot.move(3);
		System.out.println(myRobot.toString());
		myRobot.rotate(270);
		System.out.println(myRobot.toString());
		myRobot.move(2);
		System.out.println(myRobot.toString());
		System.out.println(myRobot.distance(yourRobot));
		
	}

}
