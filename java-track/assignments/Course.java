
public class Course {
	
	//Fields
	private String name;
	private int credits;
	private int remainingSeats;
	public Student[] roster;
	public int studentsInClass;
	public int rosterLimit;
	public double gpaSum;
	public double indGPA;
	
	//Constructors
	public Course(String name, int credits, int remainingSeats)
	{
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
		roster = new Student[remainingSeats];
		this.rosterLimit = remainingSeats;
		this.studentsInClass = 0;
		this.gpaSum = 0.0;
	}
	
	//Getters
	public String getName()
	{
		return this.name;
	}
	
	public int getCredits()
	{
		return this.credits;
	}
	
	public int getRemainingSeats()
	{
		return this.remainingSeats;
	}
	
	//Setters
	public void enroll(Student s)
	{
		
		int i = rosterLimit - remainingSeats;
		roster[i] = s;
		studentsInClass += 1;
//		System.out.println(studentsInClass);
	}
	
	public boolean isAlreadyEnrolled(Student s)
	{
		boolean answer = false;
		for (int i = 0; i < studentsInClass; i++)
		{
			if (roster[i].getName() == s.getName())
			answer = true;
		}
		return answer;
	}
	
	public boolean addStudent(Student s)
	{
		if (remainingSeats == 0)
		{
			return false;
		}
		else if (isAlreadyEnrolled(s) == true)
		{
			return false;
		}
		else
		{
			enroll(s);
			remainingSeats = remainingSeats -1;
			return true;
		}
	}
	
	public double averageGPA()
	{
		gpaSum = 0;
		for (int i = 0; i < studentsInClass; i++)
		{
			indGPA = roster[i].getGPA();
			gpaSum = gpaSum + indGPA;
		}
		return (gpaSum / studentsInClass);
	}
	
	public String toString()
	{
		return "Course Name: " + name + " Course credits: " + ("" + credits);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c = new Course("science", 3, 10);
		Student s = new Student("S", "T", 1);
		Student s2 = new Student("U", "D", 2);
		s2.submitGrade(1, 3);
		s.submitGrade(3,3);
		c.addStudent(s);
		c.addStudent(s2);
		System.out.println(c.averageGPA());

	}

}
