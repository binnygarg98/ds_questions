package Lcm;
import java.util.*;
public class count 
{
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=in.nextInt();
	}
	int k=in.nextInt();
	int sum=0,count=0;
	int windosize=0;
	for(int i=0;i<size;i++)
	{
		sum=sum+arr[i];
		if(sum<=k)
		{
			windosize++;
		}
		if(sum>k)
		{
			sum=sum-arr[i-windosize];
		}
//		System.out.println(sum+" "+windosize+"\n");
		if(arr[i]==k)
		{
			count++;
			windosize=0;
			sum=0;		
		}
		else if(sum==k) {
			count++;
		}
		
	}
	System.out.println(count);
}
}
