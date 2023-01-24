import java.util.Scanner;
class multiplicationtable{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,m,n;
		System.out.println("M = ");
		m=sc.nextInt();
		System.out.println("N = ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(i+" * "+m+" = "+(m*i));
		}
	}
}
			
