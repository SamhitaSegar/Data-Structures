import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//  ww w.j a  v  a2s  .  c o  m
public class ran2 {
		  //private static double[] anArray;

		  public static void main(String args[]) {
			
			  int[] randomNumbers = new int[20];
			  Random rand = new Random();
			  for (int i = 0; i < randomNumbers.length; i++) {
			    int n = rand.nextInt(10);
			    randomNumbers[i] = n;
			  }
			  for (int i = 0; i < randomNumbers.length; i++) {
				  System.out.println("Position " + i + " : " + randomNumbers[i]);
				}  
		  } 
			  
			  //****************** or below soluion also works well
			 /* int[] randomArray = new int[20];
			  for(int i=0;i<randomArray.length;i++)
				  randomArray[i]=(int)(Math.random()*1000);
			  for(int i=0;i<randomArray.length;i++)
				  System.out.println(randomArray[i]);
				  */
		  }

