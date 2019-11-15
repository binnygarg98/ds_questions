package Lcm;
import java.util.*;
public class balance
{
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	String str=in.next();
	Stack stk=new Stack();
	char a;
	int b=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='}' )
		{
			stk.push(str.charAt(i));
		}
		else if(str.charAt(i)==')')
		{
			a=(char) stk.pop();
			if(a!='(')
			{
				b=1;
				break;
			}
		}
		else if(str.charAt(i)=='}')
		{
			a=(char) stk.pop();
			if(a!='{')
			{
				b=1;
				break;
			}
		}
		else if(str.charAt(i)==']')
		{
			a=(char) stk.pop();
			if(a!='[')
			{
				b=1;
				break;
			}
		}
	}
	if(b==0 && stk.isEmpty())
	{
		System.out.println("Balanced");
	}
	else
	{
		System.out.println("Not balanced");
	}
}
}
