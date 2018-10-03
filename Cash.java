package android;
import java.util.Scanner;
public class Cash {

	public static void main(String[]args) {
		System.out.println("Enter the cash that cashier has to give");
		float n;
		int c=0,c1=0,c2=0,c3=0;
		Scanner sc=new Scanner(System.in);//this is scanner class
		n=sc.nextFloat();
		n=n*100;
		while(n>0) {
			if(n>=25&&(n-25)>=0 )
					{
				c=c+1;
				n=n-25;
			}
			else if((n>=10&&n<25)&&(n-10)>=0) {
				c1=c1+1;
				n=n-10;
			}
			else if((n>=5&&n<10)&&(n-5)>=0) {
				c2=c2+1;
			    n=n-5;			
			}
			else if((n>=1&&n<5)&&(n-1)>=0) {
				c3=c3+1;
				n=n-1;
			}
		}
		System.out.println("The number of quaters given is"+c);
		System.out.println("The number of dimes given is"+c1);
		System.out.println("The number of nickels given is"+c2);
		System.out.println("The number of pennies given is"+c3);
		sc.close();
		
		
	}
}
