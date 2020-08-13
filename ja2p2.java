import java.util.Scanner;

class Book2{
    int id;
    String title;
    String author;
    double price;

    Book2(int id, String title, String author, double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class ja2p2 {
    public static void main(String[] args){
        int id;
        String title, author;
        double price;
        Book2[] boa = new Book2[4];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<4; i++){
            id = sc.nextInt(); sc.nextLine();
            title = sc.nextLine();
            author = sc.nextLine();
            price = sc.nextDouble();
            boa[i] = new Book2(id, title, author, price);
        }
        Book2[] nboa = searchTitle(sc.next(), boa);
        for (Book2 b2 : nboa){
            if (b2.id != 0){
                System.out.println(b2.id);
            }
        }
    }
    static Book2[] searchTitle(String s, Book2[] ba){
        int c=0;
        Book2[] res = new Book2[4];
        for (int i =0; i<4;i++){
            res[i] = new Book2(0,"","",0.0);
        }
        for (Book2 b: ba){
            if (b.title.toLowerCase().contains(s.toLowerCase())){
                res[c] = b;
                c+=1;
            }
        }
        for (int x=0; x<res.length-1; x++){
            for (int y =0; y<res.length-x-1; y++){
                if (res[y].id > res[y+1].id){
                    Book2 t = res[y];
                    res[y] = res[y+1];
                    res[y+1] = t;
                }
            }
        }
        return res;
    }
}
