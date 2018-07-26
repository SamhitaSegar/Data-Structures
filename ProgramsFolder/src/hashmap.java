import java.util.HashMap;

class hashmap
{
    static void characterCount(String[] strArray)
    {
        //Creating a HashMap containing char as a key and occurrences as  a value
 
        HashMap<String, Integer> charCountMap = new HashMap<String, Integer>();
 
        //Converting given string to char array
        //char[] strArray = inputString.toCharArray();
 
        //checking each char of strArray
            
        for (String c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
 
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
 
                charCountMap.put(c, 1);
            }
        }
 
        //Printing the charCountMap
 
        System.out.println(charCountMap);
    }
 
    public static void main(String[] args)
    {
       
    	String[] str = new String[]{"Java", "J2EE", "Java", "JSP", "J2EE"};
    	
    	characterCount(str);
    	
       
    }
}