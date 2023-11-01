package Accenture_2024;
import java.util.Scanner;
public class String_Permutation {

	public static void Permutation(String str) {
		int num=str.length();
		int l=str.charAt(0);
		int r=str.charAt(num-1);
		if(l==r) {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		/*if the character of the string are unique
		 * *example->abc
		 * the permutation of abc->6
		 * abc has 3 three character in it
		 * if the character of the string are unique then permutation of any string will be length factorial of that string
		 * so the permutation of abs will be 3! 
		 * if there is any duplicate character in the string then 
		 * the permutation will be total number of character factorial divided by duplicate character factorial
		 * example-> eye ->3!/2!
		 * example->abcba->5!/(2!*2!), because b and a occur two times
		 */
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		Permutation(str);
	}

}
