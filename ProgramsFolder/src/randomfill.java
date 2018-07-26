import java.util.Random;
public class randomfill {

	    private static int[] anArray;

	    public static int[] list(){
	        anArray = new int[10];   
	        return anArray;
	    }

	    public static void print(){
	        for(int n: anArray){
	            System.out.println(n+" ");
	        }
	    }
	    public static int randomFill(){
	        Random rand = new Random();
	        int randomNum = rand.nextInt();
	        return randomNum;
	    }

	    public static void main(String args[]) {
	        list();
	        for(int i = 0; i < anArray.length; i++){
	            anArray[i] = randomFill();
	        }
	        print();
	    }
	}
