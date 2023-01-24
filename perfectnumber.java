import java.util.Scanner;
class perfectnumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Given number : ");
		int a=sc.nextInt();
		int b=a;
		int c=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				c=c+i;
			}
		}
		if(a==c)
		{
			System.out.println("It is a perfect number ");
		}
		else
		{
			System.out.println("It is not a perfect number ");
		}
		
	}
}
