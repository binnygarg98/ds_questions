package Lcm;
import java.util.*;
public class subarray 
{
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	int k=in.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=in.nextInt();
	}
	for(int i=0;i<=size-k;i++)
	{
		int f=k+i;
		int max=0;
		for(int j=i;j<f;j++)
		{
			if(max<arr[j])
			{
				max=arr[j];
			}
		}
		System.out.println(max+" ");
	}
}

}
