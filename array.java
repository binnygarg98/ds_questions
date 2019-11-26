package Lcm;
import java.util.*;
public class array 
{
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	int m=in.nextInt();
	int n=in.nextInt();
	int s=in.nextInt();
	int arr1[]=new int[m];
	int arr2[]=new int[n];
	int arr3[]=new int[1000];
	for(int i=0;i<m;i++)
	{
		arr1[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		arr2[i]=in.nextInt();
		arr3[arr2[i]]=1;
	}
	for(int i=0;i<m;i++)
	{
		int f=arr1[i]-s;
		if(f<0)
		{
			f=-(f);
		}
		if(arr3[f]==1)
		{
			System.out.println(arr1[i]+" "+f);
		}
	}
}
}
