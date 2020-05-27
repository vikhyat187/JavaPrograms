package strings;

public class StringToIntegerRecursion {

		public static void main(String args[]) {
			String s="023232783";
			//@Override
			int c=0;
			for (int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				c=c*10+ch-'0';
			}
			System.out.println(c);
		}
}
