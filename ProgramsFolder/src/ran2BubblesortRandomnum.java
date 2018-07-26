import java.util.Random;

public class ran2BubblesortRandomnum {
	 private static double[] anArray;
	   
	 
	 public static void main(String a[]) {
	     
	/*    Random randomGenerator = new Random();
	    int[] array = new int[100];
	    for (int idx = 0; idx < 100; ++idx){
	      array[idx] = randomGenerator.nextInt(100) + 1;*/
	    
	    int[] randomNumbers = new int[20];
		  Random rand = new Random();
		  for (int i = 0; i < randomNumbers.length; i++) {
		    int n = rand.nextInt(10);
		    randomNumbers[i] = n;
		  }
		  for (int i = 0; i < randomNumbers.length; i++) {
			  System.out.println("Position " + i + " : " + randomNumbers[i]);
			}
	   
	    
	    System.out.println("Values Before the sort:\n");
	    for (int i = 0; i < randomNumbers.length; i++)
	        System.out.print(randomNumbers + "  ");
	    System.out.println();
	    bubble_srt(randomNumbers, randomNumbers.length);
	    System.out.print("Values after the sort:\n");
	    for (int i = 0; i < randomNumbers.length; i++)
	        System.out.print(randomNumbers + "  ");
	    }

	
	public static void bubble_srt(int a[], int n) {
	    int i, j, t = 0;
	    for (i = 0; i < n; i++) {
	        for (j = 1; j < (n - i); j++) {
	            if (a[j - 1] > a[j]) {
	                t = a[j - 1];
	                a[j - 1] = a[j];
	                a[j] = t;
	            }
	        }
	    }
	}
	
}
