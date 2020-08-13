import java.util.Scanner;

public class ji1 {
    public static void main(String[] args){
        int min = 1000;
        char ch = ' ';
        Scanner sc = new Scanner(System.in);
        String sValue = sc.next();
        char[] cArr = sValue.toCharArray();
        for (char c : cArr){
            if ( c < min){
                min = c;
                ch = c;
                System.out.println(min);

            }
        }
        System.out.println(ch);
    }
}
