package strings;
import java.util.*;
public class ParanthesisChecker {

	public static void main(String[] args) {
		int t;
	Scanner	sc=new Scanner(System.in);
	t=sc.nextInt();
	sc.nextLine();
	Stack<Character> stack =new Stack<>();
	String s=sc.nextLine();
	while(t--!=0)
		{
		boolean isBalanced=true;
		for (int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if (ch=='{'||ch=='['||ch=='(') {
					stack.push(ch);
					continue;
				}
					if(stack.isEmpty()) {
						isBalanced=false;
						break;
					}
					if (ch=='}') {
						if (stack.peek()=='{') {
							stack.pop();
						}
						else
						{
							isBalanced=false;
							break;
						}
					}

					if (ch==']') {
						if (stack.peek()=='[') {
							stack.pop();
						}
						else
						{
							isBalanced=false;
							break;
						}
					}

					if (ch==')') {
						if (stack.peek()=='(') {
							stack.pop();
						}
						else
						{
							isBalanced=false;
							break;
						}
					}
					
			}
					if (!stack.isEmpty()) {
						isBalanced=false;
						break;
				}
			
				if (isBalanced)
					System.out.println("balanced");
				else
					System.out.println("not balanced");		
			}
}
	}
