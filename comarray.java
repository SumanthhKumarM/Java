import java.util.Scanner;
import java.util.*;
class comarray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<Integer>();
		System.out.print("Enter the size of the first array : ");
		int n=sc.nextInt();
		int a1[]=new int [n];
		for (int i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
 		System.out.print("Enter the size of the second array : ");
		int m=sc.nextInt();
		int a2[]=new int [m];
		for (int j=0;j<m;j++)
		{
			a2[j]=sc.nextInt();
		}
		for(int x=0;x<n;x++)
		{
			for(int y=0;y<m;y++)
			{
				if(a1[x]==a2[y])
				{
					l.add(a1[x]);
				}
			}
		}                                                                                  
		System.out.print(l);
	}
}
