package Lcm;
import java.util.*;
public class adacent
{
	public static String duplicate(String s)
	{
		String s1="";
		if(s.length()<=1)
		{
			return s;
		} 
		else if(s.charAt(0)==s.charAt(1))
		{
		int i=0;
		while(i<s.length()-1 && s.charAt(0)==s.charAt(i+1))
		{
			i++;
		}
		 String s2=duplicate(s.substring(i+1));
		 return s2;
		}
		else
		{
		 s1=s1+s.charAt(0)+duplicate(s.substring(1));
	    }
		return s1;
	}
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	String s=in.next();
String s1="";
	s1=duplicate(s);
	System.out.println(s1);
}
}
