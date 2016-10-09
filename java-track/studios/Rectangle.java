
public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle (double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public double getArea()
	{
		return this.length * this.width;
	}

	public double getPerimeter()
	{
		return (this.length * 2) + (this.width * 2);
	}
	
	public boolean isSquare()
	{
		if(this.length == this.width)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isSmaller(Rectangle rectangle)
	{
		if (getArea() < rectangle.getArea())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle firstRectangle = new Rectangle(2, 4);
		System.out.println(firstRectangle.getLength());
		System.out.println(firstRectangle.getWidth());
		System.out.println(firstRectangle.getArea());
		System.out.println(firstRectangle.getPerimeter());
		System.out.println(firstRectangle.isSquare());
		Rectangle secondRectangle = new Rectangle(4, 4);
		System.out.println(secondRectangle.isSquare());
		System.out.println(firstRectangle.isSmaller(secondRectangle));
		System.out.println(secondRectangle.isSmaller(firstRectangle));

	}

}
