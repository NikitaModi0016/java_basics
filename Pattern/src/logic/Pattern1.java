package logic;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int r=sc.nextInt();
		printPattern(r);
	}
	public static void printPattern(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
