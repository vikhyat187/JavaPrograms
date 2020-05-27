package patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int j=0;j<n-i+1;j++)
			{
				System.out.print("* ");
			} /*
				 * for (int j=1;j<n-i+1;j++) { System.out.print("* "); }
				 */	
			System.out.println();
		}
	}
}
