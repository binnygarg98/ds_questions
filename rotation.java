package Lcm;
import java.util.*;
public class rotation 
{
	static node head;
	class node
	{
		int data;
		node next;
		node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void insert(int d)
	{
		node n1=new node(d);
		if(head==null)
		{
			head=n1;
		}
		else
		{
			node temp1=head;
				while(temp1.next!=null)
				{
					temp1=temp1.next;
				}
				temp1.next=n1;
			
		    }
	}
	public void r(int k)
	{
		for(int i=0;i<k;i++)
		{
			node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next.next=head;
			head=temp.next;
			temp.next=null;
		}
		
	}
	public void display()
	{
		node temp2=head;
		while(temp2!=null)
		{
			System.out.print(temp2.data+" ");
			temp2=temp2.next;
		}
	}
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		rotation obj=new rotation();
		int size=in.nextInt();
		for(int i=0;i<size;i++)
		{
			int a=in.nextInt();
			obj.insert(a);
		}
		System.out.println("enter the Rotation");
		int z=in.nextInt();
		obj.r(z);
		obj.display();
	}
	}

