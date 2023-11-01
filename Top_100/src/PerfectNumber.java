import java.util.Scanner;
public class PerfectNumber {

	/*Basic approach
	 * static int isPerfectNumber(long N) {
		if(N==1) {
			return 0;
		}
		int sum=1;
		for(int i=2;i<=Math.sqrt(N);i++) {
			if(N%i==0) {
				sum+=i+N/i;
			}
		}
		if(sum==N) {
			System.out.println("The number is perfect Number");
		}
		else {
			System.out.println("Not perfect");
		}
		return 0;
	}*/
	// Optimized Approach
	
	    static int isPerfectNumber(long N) {
	        if (N <= 1) {
	        	System.out.println("Not perfect");
	        }

	        long sum = 1;

	        for (long i = 2; i * i <= N; i++) {
	            if (N % i == 0) {
	                sum += i;
	                long otherDivisor = N / i;
	                if (otherDivisor != i) {
	                    sum += otherDivisor;
	                }
	            }

	            // If the sum exceeds N, it can't be a perfect number
	            if (sum > N) {
	            	System.out.println("Not perfect");
	            	System.exit(0);
	            }
	        }

	        if (sum == N) {
	        	System.out.println("The number is perfect Number");
	        }

	        return 0;
	    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		long N=sc.nextLong();
		isPerfectNumber(N);
	}

}
