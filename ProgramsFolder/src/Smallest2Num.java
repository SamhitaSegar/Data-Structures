

//********************************INCOMPLETE WRONG PROGRAM ****************************************
//**********************************CORRECTIONS NEEDED********************************************
class Smallest2Num
{
	public static void main(String[] args)
    {
         //write a method which returns the sum of the 2 smallest integers
        //{1, 2, 4, 8, 3, 1} = 3
       
        //int n ={1,2,4,8,3,1};
    	int n[]={1,2,4,8,3,1};
        
        sort(n);
        System.out.println("after sorting");
        for(int i=0;i<n.length;i++)
        {
        	System.out.println(n[i]);
        }
        
    }
        
        public static void sort(int n[])
        {
        	int temp;
        	for(int i=0;i<n.length;i++)
        	{ 
        		for(int j=1;j<(n.length-i);j++)
        		{
        			if(n[j-1]>n[j])
        			{
        				temp=n[j-1];
        				n[j-1]=n[j];
        				n[j]=temp;
        			}
        		}
        }
           
 
    }
}

