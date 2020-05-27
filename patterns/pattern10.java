package patterns;
import java.util.Scanner;
public class pattern10 {
public static void main(String args[])
{
	int n;
	int j;
	int l;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	l=n;
	for (int i=0;i<n;i++)
	{
		if (i>0)
		{
			for (int k=0;k<=i;k++)
			System.out.print("  ");
		}
		for ( j=l-1;j>=0;j--)
		{
			System.out.print("* ");
		}l--;
		System.out.println();
	}
}
}
