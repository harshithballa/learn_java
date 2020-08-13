import java.util.Scanner;

class Shirt{
    int tag;
    String brand;
    double price;
    char gender;

    Shirt(int t, String b, double p, char g){
        this.tag = t;
        this.brand = b;
        this.price = p;
        this.gender = g;
    }
}

public class ja2p1 {
    public static void main(String[] args) throws Exception {
        /* Do not alter code in main method */
        Shirt[] shirts = new Shirt[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<5;i++)
        {
            int tag = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            char g = sc.nextLine().charAt(0);
            shirts[i] = new Shirt(tag,brand,price,g);
        }
        double price = sc.nextDouble();

        for(Shirt s: shirts)
        {
            System.out.println(getDiscountPrice(s));
        }

        Shirt[] result = getShirtWithMoreThanSpecificPrice(shirts,price);

        for(Shirt s: result)
        {  if(s.tag!=0)
            System.out.println(s.tag+" "+s.price+ " " + s.brand);
        }
    }
    public static double getDiscountPrice(Shirt s){
        double disc;
        if (s.gender == 'm'){
            disc = s.price*0.9;
        }
        else if (s.gender == 'f'){
            disc = s.price*0.8;
        }
        else {
            disc = s.price*0.7;
        }
        return disc;
    }
    public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts, double price){
        Shirt[] nsa = new Shirt[shirts.length];
        for (int c = 0; c<5; c++){
            nsa[c] = new Shirt(0, " ", 0.0, ' ');
        }
        int i =0;
        for (Shirt s : shirts){
            if (s.price > price){
                nsa[i] = s;
                i +=1;
            }
        }
        try {
            for (int a = 0; a < nsa.length - 1; a++) {
                for (int b = 0; b < nsa.length - a - 1; b++) {
                    if (nsa[b].price > nsa[b+1].price) {
                        Shirt t = nsa[b];
                        nsa[b] = nsa[b + 1];
                        nsa[b + 1] = t;
                        }
                    }
                }
            }
        catch (NullPointerException ignored){
        }

        return nsa;

    }
}
