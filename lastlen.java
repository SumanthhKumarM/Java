import java.util.Scanner;
import java.util.*;
class lastlen{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		List<Integer> list=new ArrayList<Integer>();
		int count=0;		
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch==' ')
			{
				count=count+1;
				
			}
			else
			{
				list.clear();
			}
		}
		System.out.print(count);
	}
}
