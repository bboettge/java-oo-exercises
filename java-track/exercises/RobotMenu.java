import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
	
	private ArrayList<Robot> robots;
	private Scanner s;

	public static void main(String[] args) {
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do {
			x = rm.startMenu();
			rm.processInput(x);
		} while (x != 6);	
	}

	public RobotMenu()
	{
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu()
	{
		System.out.println("Welcome to the robot menu!");
		System.out.println("1. Create a robot");
		System.out.println("2. Display the list of available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		System.out.println("Please select an option");
		
		while (!s.hasNextInt())
		{
			System.out.println("Invalid selction, please select a number 1-6:");
			s.next();
		}
		
		int selection = s.nextInt();
		while (selection < 0 || selection > 6)
		{
		System.out.println("Invalid selection, please select a # 1-6:");
			selection = s.nextInt();
		}
		
		return selection;
	}
	
	public void processInput(int selection)
	{
		if(selection == 1)
		{
			createRobot();
		}
		else if(selection == 2)
		{
			displayRobots();
		}
		else if(selection == 3)
		{
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Please enter how much the robot should move:");
			int moveAmt = s.nextInt();
			r.move(moveAmt);
			System.out.println("Here is the robot's new status after it moved:");
			System.out.print(r);
		}
		else if(selection == 4)
		{
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Please enter a direction for the robot (north = 0, east = 90, south = 180, west = 270)");
			int rotAmt = s.nextInt();
			r.rotate(rotAmt);
			System.out.println("Here is the robot's status after it was rotated:");
			System.out.println(r);
		}
		else if(selection == 5)
		{
			displayRobots();
			Robot r = selectRobot();
			Robot r2 = selectRobot();
			double dis = r.distance(r2);
			System.out.println("The distance between the robots you selected is " + dis);
		}
	}
	private void displayRobots()
	{
		for(int i = 0; i < robots.size(); i++)
		{
			System.out.println((i+1) + ".)" + robots.get(i));
		}
	}
	
	private Robot selectRobot()
	{
		System.out.println("Please select a robot: ");
		int selection = s.nextInt();
		while(selection < 1 || selection > robots.size())
		{
			System.out.print("Invalid selection, please try again: ");;
			selection = s.nextInt();
		}
		return robots.get(selection-1);
	}
	
	private void createRobot()
	{
		System.out.println("Please enter a name for the robot");
		String name = s.next();
		System.out.println("Please enter an x position for the robot");
		int coordX = s.nextInt();
		System.out.println("Please enter a y position for the robot");
		int coordY = s.nextInt();
		System.out.println("Please enter a speed fro the robot:");
		int speed = s.nextInt();
		System.out.println("Please enter an orientation for the robot (north = 0, east = 90, south = 180, west = 270):");
		int orientation = s.nextInt();
		robots.add(new Robot(name, coordX, coordY, speed, orientation));		
	}
}
