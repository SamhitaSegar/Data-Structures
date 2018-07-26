import java.util.Random;


	public class Sorting {
		int[] randomNumber;
	    private static int[] createRandomData(int num){
	        int[] randomNumber = new int[num]; //make an array lists with the random number
	        Random rand;
	        rand = new Random();
	        for (int i = 0; i<num; i++ ){  //for loops for the array
	            randomNumber[i]= rand.nextInt(num);   //method to fill the array
	        }
	        return randomNumber;

	    }

	    static long bubbleSort(int[] arr){
	        int[]a = arr.clone();  //deep copy the array to refresh
	        long startTime = System.currentTimeMillis(); //start time in counting the data
	        for(int i=a.length-1;i>0;i--){
	            for(int j=0;j<i;j++){
	                if(a[j]>a[j+1]){
	                    a[j]=a[j]+a[j+1];
	                    a[j+1]=a[j]-a[j+1];
	                    a[j]=a[j]-a[j+1];
	                }
	            }
	        }
	        long endTime = System.currentTimeMillis();   //timer off
	        return endTime - startTime; //final count by subtracting them
	    }

	    private static long selectionSort(int[] arr){ //selection sort method
	        int[]a = arr.clone();  //deep copy the array to refresh
	        long startTime = System.currentTimeMillis(); //start time in counting the data
	        for(int i=0;i<a.length;i++){
	            int min = a[i];
	            int min_idx = i;
	            for(int j=i+1;j<a.length;j++){
	                if(a[j]<min){
	                    min = a[j];
	                    min_idx = j;
	                }
	            }
	            if(min_idx!=i){
	                a[min_idx]=a[i];
	                a[i]=min;
	            }
	        }
	        long endTime = System.currentTimeMillis();   //timer off
	        return endTime - startTime; //final count by subtracting them
	    }

	

	   public static void main(String[] args) {
	       int[] data_set = {1, 2, 10, 20, 100};
	       long bubble = 0;
	       long selection;
	      
	     

	           int count = 0;
	           int sum = 0;
	           System.out.println("computing q SORT");
	           while(count<100 && bubble < 60000){
	               System.out.print('.');
	               int len=0;
				bubble = Sorting.bubbleSort(createRandomData(len));
	               sum += bubble;
	               count ++;
	               if(bubble>60000) break;
	           }
	           System.out.print("DONE\n");

	         
		
	       }
	    }



