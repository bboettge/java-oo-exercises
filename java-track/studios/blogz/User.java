package blogz;

public class User {

	//Fields
	private String username;
	private String password;
	
	//Constructor
	public User(String username, String password)
	{
		this.username = username;
		this.password = hashPassword(password);
	}
	
	//Behaviors
	
	//Getters
	public String getUsername()
	{
		return this.username;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	//Setters
	public static String hashPassword(String password)
	{
		return password;
	}
	
	//Validators
	public boolean isValidPassword(User user, String password)
	{
		if (user.getPassword() == hashPassword(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isValidUsername(username)
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
