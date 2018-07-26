import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class commonchar {

	int totalnumber =0;
	String[] str = new String[20];
	String commonchar =new String();
	
	public void readinput()
	{
	Scanner sc = new Scanner (System.in);
		System.out.print("enter number of strings");
		
		 totalnumber = sc.nextInt();
		
		System.out.print("enter array of strings");
		
		for(int i=0;i< totalnumber;i++)
		{
			str[i] = sc.next();	
		}
		sc.close();
	}
	
	public void printoutput()
	{
		System.out.println("the contents of array");
		for(int i=0;i< totalnumber;i++)
		{
			System.out.println(str[i]);
		}
		
	}
	
	public void findcommonchar()
	{
		commonchar = str[0];
		for(int i=1;i<totalnumber;i++)
		{
			int length = commonchar.length();
			for(int j=0;j<length ;j++)
			{
				try{
				if(commonchar.charAt(j)== str[i].charAt(j))
				{
					continue;
				}
				else
				{
					commonchar = str[i].substring(0, j);
				}
				}catch(Exception e){ 
					commonchar = str[i].substring(0, j-1);
					continue;}
			}
		}
	}
	
	public static void main(String[] args) {
		commonchar a = new commonchar();
		a.readinput();
		a.findcommonchar();
		System.out.println("Commonchar is "+a.commonchar);
		a.printoutput();
	}

}
