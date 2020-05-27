package sets;

import java.util.*;
import java.lang.*;
import java.io.*;
public class KthSmallestEle {
	public static void main (String[] args) {
		//code
		
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t--!=0){
			Set<Integer> set=new HashSet<>();
			int n;
		n=sc.nextInt();
		int[] a=new int[n];
		for (int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		set.add(a[i]);
	int i=0;
	Iterator<Integer> iterate =set.iterator();
	while (i++<k) {
		iterate.next();
	}
	System.out.println(iterate.next());

		}
	}
}