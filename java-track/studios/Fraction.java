
public class Fraction {
	
	private int num;
	private int den;
	
	public Fraction(int num, int den)
	{
		this.num = num;
		this.den = den;
	}
	
	public int getNum()
	{
		return this.num;
	}
	
	public int getDen()
	{
		return this.den;
	}
	
	public void setReciprical()
	{
		int newNum = this.den;
		int newDen = this.num;
		newDen = den;
		newNum = num;
	}

	public static void main(String[] args) {
		Fraction firstFraction = new Fraction(2,4);
		System.out.println(firstFraction.getNum());
		System.out.println(firstFraction.getDen());
		firstFraction.setReciprical();
		System.out.println(firstFraction.getNum());
		System.out.println(firstFraction.getDen());

	}

}
