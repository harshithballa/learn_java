//package learning;
import java.util.Scanner;
public class six {
	static int x = 5;
	static int y = 7;
	
	int z = 1;
	
	private char c = 'a';
	
	public six () {
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();	
		z = sc.nextInt();
	}
	
	static int staticAdd() {
		//return x+y+z;
		return x + y;
	}
	
	public int publicAdd() {
		return x+y+z;
	}
	
	public static void main (String [] args) {
		
//		System.out.println(x);
//		System.out.println(y);
//		//System.out.println(z);  // Z IS NON STATIC
//		
//		System.out.println(x+y);
//		//System.out.println(x + y + z); // Z IS NON STATIC
//		
//
//		System.out.println(staticAdd());
//		
//		System.out.println(six.x);
//		System.out.println(six.y);
//		System.out.println(six.staticAdd());
		
//		
//		six obj = new six();
//		
//		System.out.println(x);
//		System.out.println(y);
//		
//		
//		System.out.println(obj.x);
//		System.out.println(obj.z);
//		System.out.println(obj.staticAdd());
//		System.out.println(obj.publicAdd());
//
//		System.out.println(obj.c);
		
		six2.check();
	}

	public char getC() {
		return c;
	}

	public void setC(char C) {
		this.c = C;
	}
	
	
}

class six2 {
	public static void check() {
		System.out.println(six.x);
		System.out.println(six.y);
		
		six obj2 = new six();
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		System.out.println(obj2.z);
		//System.out.println(obj2.c);
		
		System.out.println(obj2.getC());
		obj2.setC('e');
		System.out.println(obj2.getC());
	}
}
