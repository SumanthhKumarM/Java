import java.util.Scanner;
class Bankdet{
	void details(){
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		Scanner q=new Scanner(System.in);
		int an=sc.nextInt();
		String dn=sc.nextLine();
		int balance=s.nextInt();
		System.out.print("Type of account(S/C): ");
		char c=s.next().charAt(0);	
		System.out.print("Enter the operation to be done(D-deposit/ W-withdraw): ");
		char e=q.next().charAt(0);
		if(e=='D')
		{
			int n=q.nextInt();
			balance=balance+n;
			System.out.println("balance");
		}
		else if(e=='W'){
			int m=q.nextInt();
			if(balance>500){
				balance=balance-m;
				System.out.println("balance");
			}
			System.out.println("balance<500");
		}
	
	}
	public static void main(String arga[]){
		Bank b=new Bank();
		b.details();
	}
}
		
