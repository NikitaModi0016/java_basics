import java.util.Scanner;
class Box
{
	double length, breadth, height;
	Box()
	{
		length=0.0;
		breadth=0.0;
		height=0.0;
	}
	Box(double l)
	{
		length=l;
		breadth=l;
		height=l;
	}
	Box(double l,double b,double h)
	{
		this.length=l;
		this.breadth=b;
		this.height=h;	
	}
	void volume()
	{
		System.out.println("The volume is:"+length*breadth*height);
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the length,breadth and height:");
	double l=s.nextDouble();
	double b=s.nextDouble();
	double h=s.nextDouble();
	Box ob1=new Box();
	ob1.volume();
	Box ob2=new Box(l);
	ob2.volume();
	Box ob3=new Box(l,b,h);
	ob3.volume();
}

}