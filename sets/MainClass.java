package sets;
import java.util.*;
public class MainClass {
	public static void main(String args[]) {
		Set<Integer> x=new HashSet<>();
		Set<Integer> y=new HashSet<>();
		x.add(5);
		x.add(2);
		x.add(3);
		y.add(1);
//		y.add(6);
//		y.add(7);
		System.out.println(x.containsAll(y));
		System.out.println(x);
	}
}
