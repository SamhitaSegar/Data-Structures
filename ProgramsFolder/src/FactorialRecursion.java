import java.util.Scanner;

public class FactorialRecursion {


		public static int fact(int n){
			int result=1;
			if(n==1){
			return 1;	
			}
			result=n*fact(n-1);
			
			return result;
	    }
	   public static void main(String[] args) {
	      
		   Scanner sc=new Scanner(System.in);
		System.out.println("enter the nubmer");
		   int n=sc.nextInt();
		    int result=fact(n);
		    System.out.println(result);
	   }
	}
