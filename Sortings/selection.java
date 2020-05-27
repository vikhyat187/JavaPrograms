package Sortings;
import java.util.Scanner;
public class selection {
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		int minIndex=0,temp;
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			minIndex=i;
			for (int j=i;j<n;j++)
			{
				if (a[j]<a[minIndex])
				{
					minIndex=j;
				}
				}
			temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
			}

	for (int i=0;i<n;i++)
	{
		System.out.print(a[i]+ " ");
	}
}
}
