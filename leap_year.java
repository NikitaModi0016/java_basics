import java .util.Scanner;
class year
{
 	year(int yr)
	{
		if(yr%4==0 && yr%100!=0 || yr%400==0)
		{
			System.out.println(yr+" "+"is a leap year");
		}
		else
			System.out.println(yr+" "+"is not a leap year");
	}
public static void main(String args[])
{
	int y;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the year:");
	y=s.nextInt();
	year obj=new year(y);
}
}