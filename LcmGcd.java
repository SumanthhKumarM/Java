import java.util.Scanner;
class LcmGcd{
	public static int gcd(int a,init b){
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(a,(b%a));
		}
	}
	public static int lcm(int a,int b, int gcdvalue)
	{
		return Math.abs(a*b)/gcdvalue;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a and b : ");
		a=sc.nextInt();
		b=sc.nextInt();
		int gcdvalue=gcd(a,b);
		System.out.println("GCD : "+ gcdvalue);
		System.out.println("LCM : "+ lcm(a,b,gcdvalue));
	}
}
