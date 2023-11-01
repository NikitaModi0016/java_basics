import java.util.Scanner;
public class Rev_num {

	public static void Reverse(int n) {
		int sum=0,q;
		int num=n;
		while(n>0) {
			q=n%10;
			sum=sum*10+q;
			n=n/10;
		}
		System.out.println("The Reverse of given number"+num+" is "+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse it:");
		int n=sc.nextInt();
		Reverse(n);
		
	}

}
