package patterns;
import java.util.Scanner;
public class pattern11 {
public static void main(String args[])
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int i;
	for ( i=1;i<=n;i++)
	{
		for (int j=1;j<=n-i;j++)
		System.out.print(" ");
		for (int j=i;j>0;j--) {
			System.out.print(j+" ");
		}
		if (i>=2)
		{
		for(int j=2;j<=i;j++)	
		{
			System.out.print(j+" ");
		}
		}
		System.out.println();
		
	}
	
	
}
}
