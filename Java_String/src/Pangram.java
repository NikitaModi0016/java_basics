import java.util.HashSet;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Sentence to Check whether the String is Pangram or not:");
		String s1=sc.nextLine();
		String str=s1.toLowerCase();
		boolean isPangram=checkPangram(str);
		 if (isPangram) {
	            System.out.println("The given string is pangram");
	        } else {
	            System.out.println("The given string is not pangram");
	        }
		
	}
	public static boolean checkPangram(String s1) {
		
		HashSet <Character> alphabetSet=new HashSet<>();
		for(int i='a';i<='z';i++) {
			alphabetSet.add((char) i);
		}
		
		//Remove every character and check
		//if set becomes empty at any point of time
		for(int i=0;i<s1.length();i++) {
			alphabetSet.remove(s1.charAt(i));
			if(alphabetSet.isEmpty())
				return true;
		}
		return false;
	}

}
