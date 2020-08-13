import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    double price;
    Book(int id, String title, String author, double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class ja1p2 {
    public static void main (String[] args){
        int bid, bpr;
        String bti, bau;
        Book[] boa = new Book[4];
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<4; i++){
            bid = sc.nextInt();
            bti = sc.next();
            bau = sc.next();
            bpr = sc.nextInt();
            boa[i] = new Book(bid, bti, bau, bpr);
        }
        for (Book eb : sortBooksByPrice(boa)){
            System.out.println(eb.id+" "+eb.title+" "+eb.author+" "+eb.price);
        }
    }
    static Book[] sortBooksByPrice(Book[] bobj){
        for (int a =0; a < bobj.length -1; a++){
            for (int b=0; b< bobj.length - a - 1; b++){
                if (bobj[b].price > bobj[b+1].price){
                    Book t = bobj[b];
                    bobj[b] = bobj[b+1];
                    bobj[b+1] = t;
                }
            }
        }
        return bobj;
    }

}
