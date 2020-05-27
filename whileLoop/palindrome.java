package whileLoop;
import java.util.Scanner;
public class palindrome {
public static void main(String args[])
{
	int n;
	Scanner sc =new Scanner (System.in);
	n=sc.nextInt();
	int r,d=0,temp;
	temp=n;
	while(temp>0)
	{
		r=temp%10;
		d=d*10+r;
		temp=temp/10;
	}
	if(d==n)
		System.out.println("palindrome");
	else 
		System.out.println("not");
}
}
