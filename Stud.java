import java.util.Scanner;
class Stud
{
	String name;
	int roll;
 	
	double attendence;
	Stud(String name, int roll,double attendence)
	{
		this.name=name;
		this.roll=roll;
		
		this.attendence=attendence;
	}
	void eligibility()
	{
		 if(this.attendence>=75)
		{
			System.out.println("You are eligible for the exam.");
		}
		else
		{
			System.out.println("You are not eligible for the exam.");
		}
	}
	void display()
	{
		System.out.println("Name of the student:"+name);
		System.out.println("Roll no:"+roll);
		
		System.out.println("The attendence is:"+attendence);
		
	
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter your name :");
		String name=s.next();
		System.out.println("Enter your roll no:");
		int roll=s.nextInt();
		System.out.println("Enter your attendence");
		double attendence=s.nextDouble();
		Stud sc=new Stud(name,roll,attendence);
		sc.display();
		sc.eligibility();
	}
}