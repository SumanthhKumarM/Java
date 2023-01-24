import java.util.*;
import java.util.Scanner;
class quad{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 b,a,c;
		long x,y;
		System.out.println("Enter the Coeffiecient of 2 degree variable : ");	
		b=sc.nextInt();
		System.out.println("Enter the Coeffiecient of 1 degree variable : ");		
		a=sc.nextInt();
		System.out.println("Enter the Coeffiecient of constant : ");	
		c=sc.nextInt();
		x=((-b*b)-(Math.sqrt((4*(b*b)))/(2*a*c)));
		System.out.println(" First root : "+x);
		y=((-b*b)+(Math.sqrt((4*(b*b)))/(2*a*c)));
		System.out.println(" second root : "+y);
	}
}	
