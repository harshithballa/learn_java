//package learning;
import java.util.Scanner;
public class five {
	public static void main (String [] args) {
		String [] Nations = { "India", "America", "China", "Japan", "Brazil" };
		
		int i = 0;
//		for (i=0; i< Nations.length; i++) {
//			System.out.println(Nations[i]);
//		}
//		
//		
//		
//		System.out.println("\n\n");
//		
//		for (String s : Nations) {
//			System.out.println(s);
//		}
//		
		
		
//		int array [] = {1,2,3,4,5};
//		for (int k=0; k<array.length; k++) {
//			System.out.println(array[k]);
//		}
		
		
		
		Scanner sc  = new Scanner(System.in);
		String[]  str   = new   String[5];
		
		for (i=0;i<5;i++) {
			str[i] = sc.nextLine();
		}
		for (String s: str) {
			System.out.println(s.toUpperCase() + "  "+ s.length());
		}
		
		
	}
}
	
