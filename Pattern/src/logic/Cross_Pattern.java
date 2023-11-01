package logic;
import java.util.Scanner;
public class Cross_Pattern {

	public static void print(int n) {
		  int i,j,k=1,flag=1;
		    int m=n*2-1;
		    for(i=1;i<=m;i++){
		    	for(j=1;j<=m;j++){
		        	if((i==j)||(j==(n*2)-i)){
		            	System.out.print(k);
		                
		            }
		            else{
		            	System.out.print(" ");
		            }
		        
		        }
		        if(flag==1 && k<n){
		        k++;
		        }
		        else{
		        flag=0;
		        k--;
		        }
		        System.out.println();
		    }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Odd number to print cross:");
		int n=sc.nextInt();
		print(n);
	}

}
