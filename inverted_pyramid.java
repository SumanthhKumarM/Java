import java.util.Scanner;
class inverted_pyramid{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row=sc.nextInt();
		int i,j,k;
		for(i=row;i>=0;i--)
		{
			for(j=0;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
