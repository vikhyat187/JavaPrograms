package map;

import java.util.Set;
import java.util.*;
public class HashCodeAndEquals {
	public static void main(String args[]) {
		Pen pen =new Pen(10,"blue");
		Pen pen1 =new Pen(10,"blue");
		System.out.println(pen.equals(pen1));
		System.out.println(pen);
		System.out.println(pen1);
		Set<Pen> pens=new HashSet<>();
		pens.add(pen);
		pens.add(pen1);
	
	}
	
}

class Pen
{
	int price;
	String color;
		Pen(int price,String color){
			this.price=price;
			this.color=color;
			}
		
		@Override
		public boolean equals(Object obj) {
			Pen that=(Pen)obj;
			boolean isEqual=this.price==that.price &&
					this.color==that.color;
			return isEqual;
		}
		@Override
		public int hashCode() {
			return price + color.hashCode();
		}
}