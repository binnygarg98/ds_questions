package Lcm;
import java.util.*;
public class primefactor 
{
	public static int check(int a)
	{
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				return 0;
			}
	     }
		return 1;
	}
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int pos=0;
	for(int i=1;i<=n/2;i++)
	{
	if(n%i==0)
	{
		int f=check(i);
		if(f==1 && pos<i)
		{
			pos=i;
		}
	}
	}
	System.out.println(pos);
}
}
