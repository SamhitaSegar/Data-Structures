import java.util.*;
import java.math.*;

public class OddEven {

	public static int[] seperatOddAndEvnNos(int[] listOfNumbers) {
	    int oddNumPointer = 0;
	    int evenNumPointer = listOfNumbers.length - 1;
	    while(oddNumPointer <= evenNumPointer) {                
	            if(listOfNumbers[oddNumPointer] % 2 == 0) { //even number, swap to front of last known even number
	                int temp;
	                temp = listOfNumbers[oddNumPointer];
	                listOfNumbers[oddNumPointer] = listOfNumbers[evenNumPointer];
	                listOfNumbers[evenNumPointer] = temp;
	                evenNumPointer--;
	            }
	            else {  //odd number, go ahead... capture next element
	                oddNumPointer++;
	            }


	    }
	    return listOfNumbers;
	}


	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    int []arr = {3, 8, 12, 5, 9, 21, 6, 10};
	    int[] seperatedArray = seperatOddAndEvnNos(arr);
	    for (int i : seperatedArray) {
	        System.out.println(i);
	    }

	}
    }

