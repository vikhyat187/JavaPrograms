package questions;

import java.util.Scanner;

public class ReverseUsingRecursion {
	public static int[] Reverse(int a[],int i,int j)
	{
		if (i<j) {
			int temp;
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		Reverse(a,i++,j--);
		}
		return a;
	}
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for (int i=0;i<n;i++)
			a[i]=sc.nextInt();
		//Reverse(a,0,a.length);
		int [] revarray=Reverse(a,0,a.length-1);
		for (int i:revarray) {
			System.out.println(i);
		}
	}
}
