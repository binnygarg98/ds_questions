package Lcm;
import java.util.*;
public class chocklate
{
public static void main(String arg[])
{
	Scanner in =new Scanner(System.in);
	int size=in.nextInt();
	int arr[]=new int[size];
	int m=in.nextInt();
	for(int i=0;i<size;i++)
	{
		arr[i]=in.nextInt();
	}
	Arrays.sort(arr);
	System.out.println(arr[m-1]-arr[0]);
}
}