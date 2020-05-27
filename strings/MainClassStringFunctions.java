package strings;

public class MainClassStringFunctions {
	public static void main(String args[]) {
//		String anotherPalindrome="2 * pi + 3 * pi = 5 * pi";
		//String roar =anotherPalindrome.substring(11);
		String anotherPalindrome ="pippppiiiipi";
		System.out.println(anotherPalindrome);
		//System.out.println(roar);
		System.out.println(anotherPalindrome.contains("pi"));
		String n;
		n=anotherPalindrome.replaceAll("pi","3.14");
		System.out.println(n);
	}
}
