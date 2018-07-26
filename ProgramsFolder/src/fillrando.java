
public class fillrando {

public static void main(String[] args)
{
	int myArray[] = new int[10];
	 for(int i=0;i<myArray.length;i++)
	 {
		 myArray[i]=(int)(Math.random()*10);
	 }
	 for(int j=0;j<myArray.length;j++)
	 {
		 System.out.println(myArray[j]);
	 }
}
}
