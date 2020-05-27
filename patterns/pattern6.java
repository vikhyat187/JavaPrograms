package patterns;

import java.util.Scanner;

public class pattern6	 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int i;
		for ( i=1;i<=n;i++)
		{
//			System.out.println();
		for (int j=1;j<=(n-i);j++)
			System.out.print("  ");
		for (int j=1;j<=i;j++)
			System.out.print("*  ");
		System.out.println();
		}
	}
}
