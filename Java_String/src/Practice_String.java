import java.util.Arrays;
import java.util.Scanner;
public class Practice_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		ToCheckAnagram(s1,s2);
	}

	public static void ToCheckAnagram(String s1, String s2) {
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		if(c1.length!=c2.length) {
			System.out.println("Both the strings are not anagram..");
			System.exit(0);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i]) {
				System.out.println("Both the strings are not anagram..");
				System.exit(0);
			}
		}
		System.out.println("Both the strings are anagram");
	}
}
