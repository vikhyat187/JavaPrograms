package priorityqueue;
import java.util.*;
public class MainClass {
public static void main(String args[]) {
	PriorityQueue<String> pq=new PriorityQueue<>();
	pq.add("Apple");
	pq.add("Mango");
	pq.add("Banana");
	pq.add("Orange");
	pq.add("Kiwi");
	
	System.out.println(pq);
	System.out.println(pq.remove());
	System.out.println(pq.remove());
	System.out.println(pq.remove());
	System.out.println(pq.remove());
	
	
	System.out.println(pq.remove());
	
}
}
