package logic;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int r=sc.nextInt();
		printPattern5(r);
	}
	public static void printPattern5(int n) {
		int r=n*2-1;
		
		for(int i=1;i<=r;i++) {
			int totalColumn=i>n? 2*n-i : i;
			for(int j=1;j<=totalColumn;j++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
		
	}

}
