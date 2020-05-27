package LinkedList;
import java.util.*;
public class Introduction {
	public static void main(String args[]) {
List<Integer> ll=new Vector<>();
List<Integer> al=new ArrayList<>();
//List<Integer> ll1=new ArrayList<>();
//List<Integer> al1=new ArrayList<>();
getTimeDiff(al);
getTimeDiff(ll);
}
static void getTimeDiff(List<Integer> list )
{
	long start=System.currentTimeMillis();
	for (int i=0;i<100000;i++)
		list.add(0,i);
	long end =System.currentTimeMillis();
	System.out.println(list.getClass().getName()+" "+(end-start));
}
}