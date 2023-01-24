import java.util.Scanner;
class sum{
	public static void main(String args[]){Scanner sc=new Scanner(System.in);
			System.out.print("Enter the size of the array : ");
			int n=sc.nextInt ();
			int sum=0;
			try{
				int a[]=new int[n];
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
					sum=sum+a[i];
				}
				System.out.print(sum);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array size exceeded");
			}
		
	}
}
