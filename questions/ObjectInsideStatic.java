package questions;

public class ObjectInsideStatic {
	int x=5;
	String s="hello ";
//static {
//	ObjectInsideStatic obj =new ObjectInsideStatic();
//	System.out.println(obj.x);
//	System.out.println(obj.s);
//}
//public static void main(String args[]) {
////	System.out.println(obj);//here it throws an 
//	//error undefined symbol obj since the obj is 
//	//a local variable
//	
//}
	static ObjectInsideStatic obj=null;
	static {
		ObjectInsideStatic obj= new ObjectInsideStatic();
		//System.out.println(obj.x);
		
	}
	public static void main(String args[]) {
		System.out.println(ObjectInsideStatic.obj);
		
	}
}
