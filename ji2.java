import java.util.Scanner;

public class ji2 {
    public static void main(String[] args){
        int num;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<5; i++){
            num = sc.nextInt();
            arr[i] = fact(num);
        }
        for (int a : arr){
            System.out.println(a);
        }
// convert int to long to pass tc2.
    }
    static int fact(int n){
        int c = 1;
        while (n > 1){
            c = c*n;
            n = n - 1;
        }
        return c;
    }
}
