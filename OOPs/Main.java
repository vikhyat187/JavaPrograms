package OOPs;

public class Main {
public static void main(String args[]){
	try {
	int a=1;
	int b=0;
	int c=a/b;
	System.out.println(c);
	}catch(Exception e) {
	System.out.println(e+"kindly correct it soon ");
	System.out.println(e.getStackTrace());
	}
}
}
