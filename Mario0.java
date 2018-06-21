package android;

import java.util.Scanner;

public class Mario0 {

	public static void main(String[]args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0&&n<23)
		{
			for(int i=1;i<=n;i++)
			{
				for(int k=0;k<n-i;k++) {
					System.out.print(" ");
				}
					
					for(int j=0;j<=i;j++)
					{
						System.out.print('#');
					}
				
				
				System.out.print("\n");
			}
		}
		else {
			main(args);
		}
		
		sc.close();
	}
}
