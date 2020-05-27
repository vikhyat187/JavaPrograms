package sets;
import java.util.*;
public class SubarrayWithSumK {
	public static void main(String args[])
	{
		int[] a= {2,-3,-5,6,-6,};
		Set<Integer> set =new HashSet<>();
		boolean found=false;
		int sum=	0;
		int k=5;
		for (int element:a) {
			set.add(sum);
			sum+=element;
			if(set.contains(sum-k)) {found=true;
			break;
			}
		}
		if (found) {
			System.out.println("found");
		}
		else
			System.out.println("not found");
		}
}