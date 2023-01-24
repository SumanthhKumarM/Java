import java.util.*;
import java.util.Scanner;
class countlowup{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=0,i,pc=0,nc=0;
		while(a!=-1)
		{		
			System.out.println("Enter the integerr : ");
			a=sc.nextInt();
			if(a>0)
			{
				pc=pc+1;
			}
			else if(a<0)
			{
				nc=nc+1;
			}

		}
		System.out.println("Number of positive : "+ pc);
		System.out.println("Number of negative : "+ nc);
	}
}
