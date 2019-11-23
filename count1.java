package Lcm;
import java.util.*;
public class count1
{
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	int arr[]=new int[size];
	int k=in.nextInt();
	for(int i=0;i<size;i++)
	{
		arr[i]=in.nextInt();
	}
	int count=0;
	for(int i=0;i<size;i++)
	{
		int max=-1;
		for(int j=i;j<size;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
				if(max>k)
				{
					count++;
				}
			}
		}
	}
	System.out.println(count);
}
}
