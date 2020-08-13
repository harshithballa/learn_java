import java.util.Scanner;

class Movie{
    int movieId;
    String director;
    int rating;
    int budget;

    Movie(int m, String d, int r, int b){
        this.movieId = m;
        this.director = d;
        this.rating = r;
        this.budget =b;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getDirector(){
        return director;
    }

    public void  setDirector(String director){
        this.director = director;
    }
}
public class june05 {
    public static void main (String[] args){
        int bud, mid, mra, mbu, cra, cbu;
        Movie rmo;
        String mdi, cdi;
        Movie[] mo = new Movie[4];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<4; i++){
            mid = sc.nextInt();
            mdi = sc.next();
            mra = sc.nextInt();
            mbu = sc.nextInt();
            mo[i] = new Movie(mid, mdi, mra, mbu);
        }
        cdi = sc.next();
        cra = sc.nextInt();
        cbu = sc.nextInt();
        bud = findAvgBudgetByDirector(mo, cdi);
        if (bud > 0){
            System.out.println(bud);
        }
        else{
            System.out.println("Sorry - The given director has not yet directed any movie");
        }
        rmo = getMoviebyRatingBudget(cra, cbu, mo);
        if (rmo != null){
            System.out.println(rmo.movieId);
        }
        else{
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }

    }

    static int findAvgBudgetByDirector(Movie[] mo, String director){
        int sumBud=0, count =0;
        for (Movie m : mo){
            if (m.director.toLowerCase().equals(director.toLowerCase())){
                sumBud += m.budget;
                count++;
            }
        }
        if (count != 0){
            return sumBud/count;
        }
        return 0;

    }

    static Movie getMoviebyRatingBudget(int rating, int budget, Movie[] mo){
        for (Movie m : mo){
            if (m.rating == rating && m.budget == budget && budget%rating==0){
                return m;
            }
        }
        return null;
    }
}
