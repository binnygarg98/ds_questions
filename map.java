package Lcm;
import java.util.*;
public class phone 
{
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	//String str[]=new String [size];
	//int arr[]=new int[size];
	Map<String,Integer> mp=new HashMap<String,Integer>();
	for(int i=0;i<size;i++)
	{
		String str1=in.next();
		int a=in.nextInt();
		mp.put(str1,a);
	}
	String str2[]=new String[size];
	for(int i=0;i<size;i++)
	{
		str2[i]=in.next();
	}
	for(int i=0;i<size;i++)
	{
		int flag=0;
	    for(Map.Entry m:mp.entrySet())
	    {
	    	if(m.getKey().equals(str2[i]))
	    	{
	    		flag=1;
	    		System.out.println(m.getKey()+" "+m.getValue());
	    	}
	    }
	    if(flag==0)
	    {
	    	System.out.println("NOT FOUND");
	    }	 
	}
}
}
