import java.util.*;
import java.util.Scanner;
import java.lang.*;
class romanint{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the roman number : ");
		String s=sc.nextLine();
		Hashtable<Character,Integer> romanmap= new Hashtable<>();
		romanmap.put('I',1);
		romanmap.put('V',5);
		romanmap.put('X',10);
		romanmap.put('L',50);
		romanmap.put('C',100);
		romanmap.put('D',500);
		romanmap.put('M',1000);
		System.out.println(romanmap);
		int n=s.length();
		int num=romanmap.get(s.charAt(n-1));
		for(int i=n-2;i>=0;i--)
		{
			if(romanmap.get(s.charAt(i))>=romanmap.get(s.charAt(i+1)))
			{
				num=num+romanmap.get(s.charAt(i));
			}
			else
			{
				num=num-romanmap.get(s.charAt(i));
			}
		}
		System.out.println(num);
	}
}
