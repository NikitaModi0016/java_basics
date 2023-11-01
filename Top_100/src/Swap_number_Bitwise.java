import java.util.Scanner;
public class Swap_number_Bitwise {

	public static void Swap_number(int a, int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping the value of A is "+a+ " and B is "+b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of A and B:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping the value of A is "+a+" and B is "+b);
		Swap_number(a,b);
	}

}
