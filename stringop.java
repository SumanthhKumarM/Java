import java.util.Scanner;
import java.util.*;
class stringop{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String 1: ");
		String a=sc.nextLine();
		System.out.print("Enter the String 2: ");
		String b=sc.nextLine();
		System.out.print("Enter the character of string 1:" );
		char c=sc.next().charAt(0);
		System.out.print("Enter the character of string 2:" );
		char d=sc.next().charAt(0);
		for(int i=0;i<a.length();i++)
		{
			if((a.charAt(i))==c)
			{
				System.out.println(i);
				break;
			}
			
		}
		for(int j=0;j<b.length();j++)
		{
			if((b.charAt(j))==d)
			{
				System.out.println(j);
				continue;
			}
		}
		if(a.equals(b))
		{	
			System.out.println("Both the strings are same ");
		}
		else
		{
			System.out.println("Both the strings are not same ");
		}
		System.out.println(a.concat(b));
	}
}

			
