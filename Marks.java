import java.util.Scanner;
class Marks
{
	String name;
	double percentage;
	void display()
	{
		System.out.println("The name is:"+name);
		System.out.println("The percentage is:"+percentage);
	}
	Marks(String n,double p)
	{
		name=n;
		percentage=p;
	}
	
}
class grade
{
	static void setgrade(Marks m)
	{
		if(m.percentage>=80)
		{
			System.out.println("Grade=O");
		}
		else
		{
			System.out.println("Grade=E");
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=s.nextLine();
		System.out.println("Enter your percentage:");
		double percentage=s.nextDouble();
		Marks obj=new Marks(name,percentage);
		obj.display();
		setgrade(obj);
	}
}