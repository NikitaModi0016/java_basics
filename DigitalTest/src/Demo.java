import java.text.DecimalFormat;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the student id: ");
		int id=sc.nextInt();
		//if there is numeric value before the string then write sc.nextLine(); immediately after the numeric value
		sc.nextLine();
		System.out.println("ENter the student name:");
		String name=sc.nextLine();
		System.out.println("ENter the gender:");
		char gender=sc.next().charAt(0);
		System.out.println("ENter the Marks:");
		float marks1=sc.nextFloat();
		float marks2=sc.nextFloat();
		float marks3=sc.nextFloat();
		System.out.println("ENter the Activation:");
		boolean active=sc.nextBoolean();
		
		double result1=marks1+marks2+marks3;
		System.out.println("double result is :"+result1);
		//so here we are using the double data type to print the total instead of float because double give the more precision points and float give the less.
		//double is high accurate one and float is low accurate one
		float result2=marks1+marks2+marks3;
		System.out.println("float result is"+result2);
		//the cursor is not moved after double that is why we are not able to write string value so,if there is double value before the string then again write sc.nextLine() after the double
		sc.nextLine();
		System.out.println("Enter the className: ");
		String classname=sc.nextLine();
		System.out.println(id);
		System.out.println(gender);
		
		//Display the value in single line
		System.out.println(id+" "+name+" "+gender+" "+active+" "+result1+" "+classname);
		
		//Display the value in different line
		System.out.println(id+"\n"+name+"\n"+gender+"\n"+active+"\n"+result1+"\n"+classname);
		
		//specific digit after decimal point using string.format()
		String s1=String.format("%.2f", result1);
		System.out.println("round off value: "+s1);
		//and another way to print specific digit after decimal point
		System.out.format("round off %.2f",result1);
		//one more way to print round off
		DecimalFormat dc=new DecimalFormat("\n#.##");
		System.out.println(dc.format(result1));
		*/
		//conversion or type casting
		//automatic casting p- converting int to double
		int xy=10;
		double y=xy;
		System.out.println(xy);
		System.out.println(y);
		
		//manual casting-converting double to int
		double z=45.23;
		int a=(int)z;
		System.out.println(z);
		System.out.println(a);
		
		double b=(double)9/2;
		System.out.println(b);
		
		double d=(double)8+3*3.2;
		System.out.println(d);		
		
		
		
	}

}
