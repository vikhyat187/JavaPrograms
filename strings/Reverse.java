package strings;
import java.util.Scanner;
public class Reverse{
//String reverse="";
public static void main(String args[])
{
	String s="";
	String ans="";
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	int i=s.length()-1;
	//System.out.println(s);
	while(i>=0)
	{
	while(s.charAt(i)==' '&&i>=0)
	{
		i--;
	}
	int j=i;
	if (i<0)
		break;
		while(i>=0&&s.charAt(i)!=' ')
		{i--;
		
		}
			if (ans.isEmpty())
				ans=ans.concat(s.substring(i+1, j+1));
			else
				ans=ans.concat(" "+s.substring(i+1, j+1));
		
	}
	System.out.println(ans);
}
}