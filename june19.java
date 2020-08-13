import java.util.Scanner;

class AutonomousCar{
    int carId;
    String brand;
    int noOfTestsConducted;
    int noOfTestsPassed;
    String environment;
    String grade;

    AutonomousCar(int ci, String b, int tc, int tp, String e){
        this.carId = ci;
        this.brand = b;
        this.noOfTestsConducted = tc;
        this.noOfTestsPassed = tp;
        this.environment = e;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
}

public class june19 {
    public static void main (String[] args){
        int tp, cid, ctc, ctp;
        String cbr, cen, cenv, cbra;
        AutonomousCar ac;
        AutonomousCar[] aca = new AutonomousCar[4];
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<4; i++){
            cid = sc.nextInt();
            cbr = sc.next();
            ctc = sc.nextInt();
            ctp = sc.nextInt();
            cen = sc.next();
            aca[i] = new AutonomousCar(cid, cbr, ctc,ctp,cen);
        }
        cenv = sc.next();
        cbra = sc.next();
        tp = findTestPassedByEnv(aca, cenv);
        if (tp>0){
            System.out.println(tp);
        }
        else{
            System.out.println("There are no tests passed in this particular environment");
        }

        ac = updateCarGrade(cbra, aca);
        if (ac != null){
            System.out.println(ac.brand+"::"+ac.grade);
        }
        else{
            System.out.println("No Car is available with the specified brand");
        }
    }

    static int findTestPassedByEnv(AutonomousCar[] aca, String env){
        int sumTP =0;
        for (AutonomousCar a : aca){
            if (a.environment.toLowerCase().equals(env.toLowerCase())){
                sumTP += a.noOfTestsPassed;
            }
        }
        return sumTP;
    }

    static AutonomousCar updateCarGrade(String brand, AutonomousCar[] aca){
        int rating = 0;
        for (AutonomousCar a : aca){
            if (a.brand.toLowerCase().equals(brand.toLowerCase())){
                rating = a.noOfTestsPassed*100/a.noOfTestsConducted;
                if (rating >= 80){
                    a.grade = "A1";
                }
                else {
                    a.grade = "B2";
                }
                return a;
            }
        }
        return null;
    }
}
