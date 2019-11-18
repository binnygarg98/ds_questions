package Lcm;
import java.util.*;
public class duplicatearray
{
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	int arr[]=new int[size];
	int arr1[]=new int[10000];
	for(int i=0;i<size;i++)
	{
		arr[i]=in.nextInt();
		arr1[arr[i]]++;
	}
	for(int i=0;i<size;i++)
	{
		if(arr1[arr[i]]!=0)
		{
			System.out.println(arr[i]+" "+arr1[arr[i]]);
			arr1[arr[i]]=0;
		}
	}
}
}
