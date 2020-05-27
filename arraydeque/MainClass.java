package arraydeque;
import java.util.*;
public class MainClass {
	 public static void main(String args[])throws Exception {
		 ArrayDeque<Integer> ad = new ArrayDeque<>(); 
		 
		 ad.pollFirst();
		 System.out.println(ad.peekFirst());
	 }
}
