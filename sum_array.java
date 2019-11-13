package practice1;
import java.util.*;
public class sum 
{
public static void main(String arg[])
    {
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++)
	{
		arr[i]=in.nextInt();
	}
	int b=in.nextInt();
	int sum=0;
	int windowsize=0;
	for(int i=0;i<a;i++)
	{
		sum=sum+arr[i];
	     if(sum<=b)
		{
			windowsize++;
		}
	      if(sum>b)
		{
			sum=sum-arr[i-windowsize];
		}
	      if(sum==b)
		{
			System.out.println((i-windowsize+1)+" "+i);
		}
               if(b==arr[i])
		{
			System.out.println(i+" "+i);
			sum=0;
			windowsize=0;
		}
	}
    }
}
