import java.util.*;

public class selectionsortRandom {
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Total numbers :");
  int n = s.nextInt();

  double a[] = new double[n];
  for (int i = 0; i < a.length; i++) {
   a[i] = Math.random();
   System.out.println("Random generated total numbers are: " + a[i]);
  }
  System.out.println("\n Sorted Numbers are: " + Arrays.toString(SelectionSort(a)));
 }


 private static double[] SelectionSort(double[] a) {
 
	 for (int i = 0; i < a.length; i++) {
   for (int j = i+1; j < a.length; j++) {
    if (a[i] > a[j]) {
 double temp = a[i];
     a[i] = a[j];
     a[j] = temp;
    }
   }
  }

  return a;
 }

}