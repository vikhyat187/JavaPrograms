package patterns;

import java.util.Scanner;

public class pattern9	 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		//int count=1;
for (int i=0;i<n/2;i++) {
	for (int j=0;j<n/2-i;j++)
	System.out.print("* ");
	int k=0;
	for(int j=0;j<2*k+1;j++,k++)
		System.out.print( " ");

	for (int j=0;j<n/2-i;j++)
	System.out.print("* ");
	System.out.println();
}
}
}