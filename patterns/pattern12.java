package patterns;
import java.util.Scanner;
public class pattern12 {
	public static void main(String args[])
	{
		int n,k=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
		for (int j=0;j<n-i;j++)
			System.out.print(" ");
		k=i;
		for(int j=1;j<=i;j++,k++)
		{
			System.out.print(k+" ");
		}
		if (i>=2)
		{
			k--;
			k--;
			for(int j=1;j<=i-1;j++,k--)
			{
				System.out.print(k+ " ");
			}
		}
		System.out.println();
		}
		
	}

}
