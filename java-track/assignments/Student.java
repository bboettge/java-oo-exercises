public class Student {

	//Fields
	private String firstName;
	private String lastName;
	private int studentID;
	private double grades = 0;
	private int credits = 0;
	private double gpatotal;
	String classStanding = "Freshman";
	private double GPA = 0.0;
	
	//Behaviors
	
	//Create Student
	public Student(String firstName, String lastName, int studentID)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
	}
	
	public Student(String firstName, String lastName, int studentID, double GPA, int credits)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.GPA = GPA;
		this.credits = credits;
	}
	
	//Getters
	public String getName()
	{
		return this.firstName + " " + this.lastName;
	}
	
	public int getStudentID()
	{
		return this.studentID;
	}
	
	public double getGrades()
	{
		return this.grades;
	}
	
	public int getCredits()
	{	
		return this.credits; 
	}
	
	public double getGpaTotal()
	{
		return this.gpatotal;
	}
	
	public String getClassStanding()
	{
		if (this.credits < 30)
		{
			this.classStanding = "Freshman";
		}
		else if (this.credits < 60)
		{
			this.classStanding = "Sophomore";
		}
		else if (this.credits < 90)
		{
			this.classStanding = "Junior";
		}
		else
		{
			this.classStanding = "Senior";
		}	
		return this.classStanding;
	}
	
	public double getGPA()
	{
		return this.GPA;
	}
	
	//Setters
	public void submitGrade(double grade, int credit)
	{
		this.credits += credit;
		this.grades +=  grade;
		this.gpatotal += grade * credit;
		this.GPA = this.gpatotal / this.credits;
		this.GPA = (this.gpatotal / this.credits);
		this.GPA = (Math.round(this.GPA*1000.0)/1000.0);
//		
	}

	public double computeTuition()
	{
		int studentCredits = getCredits();
		if (studentCredits < 15)
		{
			return studentCredits * 1333.33;
		}
		else if (studentCredits == 15)
		{
			return 20000.0;
		}
		else
		{
			double additionalCredits = studentCredits % 15;
			return (additionalCredits * 1333.33) + 20000.0;
		}
	}
	
	public Student createLegacy(Student s, Student ss)
	{
		String bbFirstName = s.getName();
		String bbLastName = ss.getName();
		int bbID = s.getStudentID() + ss.getStudentID();
		double bbGPA = (s.getGPA() + ss.getGPA()) / 2;
		int bbCredits = 0;
		if (s.getCredits() >= ss.getCredits())
		{
			bbCredits = s.getCredits();
		}
		else
		{
			bbCredits = ss.getCredits();
		}
		Student bb = new Student(bbFirstName, bbLastName, bbID, bbGPA, bbCredits);
		return bb;
	}
	
	public String toString()
	{
		return "Student Name: " + this.firstName + " " + this.lastName + ", Student ID: " + getStudentID();
	}
	
	public static void main(String[] args)
	{
		Student s = new Student("A", "B", 1);
		Student ss = new Student ("C", "D", 2);
		s.toString();

		s.createLegacy(s, ss);
	}
}


