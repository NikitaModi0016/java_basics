import java.util.Scanner;
class Rectangle
{
	double length, width;
	Rectangle(double l, double w)
	{
		this.length=l;
		this.width=w;
	}
	void getArea()
	{
		System.out.println("Area of rectangle:"+length*width);
	}
}
class Box
{
	double height;
	Box(double length,double width,double h)
	{
		super(length,width);
		this.height=h;	
	}
	void getVolume()
	{
		System.out.println("The of the box is:"+length*width*height);
	}
}
class Myclass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length:");
		double l=sc.nextDouble();
		System.out.println("Enter the Width:");
		double w=sc.nextDouble();
		System.out.println("Enter the Height:");
		double h=sc.nextDouble();
		Box b=new Box(l,w,h);
		b.getVolume();
		b.getArea();
	}
}