import java.util.Scanner;

class TravelAgencies{
    int regNo;
    String agencyName;
    String pakageType;
    int price;
    boolean flightFacility;
    TravelAgencies(int r, String a, String p,int pr, boolean f){
        this.regNo = r;
        this.agencyName = a;
        this.pakageType = p;
        this.price = pr;
        this.flightFacility = f;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName){
        this.agencyName = agencyName;
    }
}
public class july17 {
    public static void main(String[] args){
        int regNo, crn, price;
        String agencyName, packageType, cpt;
        boolean ff;
        TravelAgencies[] taoa = new TravelAgencies[4];
        TravelAgencies res;
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<4; i++){
            regNo = sc.nextInt(); sc.nextLine();
            agencyName = sc.nextLine();
            packageType = sc.nextLine();
            price = sc.nextInt();
            ff = sc.nextBoolean();
            taoa[i] = new TravelAgencies(regNo, agencyName, packageType, price, ff);
        }
        crn = sc.nextInt();
        cpt = sc.next();

        System.out.println(findAgencyWithHighestPackagePrice(taoa));
        res = agencyDetailsforGivenIdandType(taoa, crn, cpt );
        if (res != null){
            System.out.println(res.agencyName+":"+res.price);
        }


    }
    static int findAgencyWithHighestPackagePrice(TravelAgencies[] taa){
        int max = 0;
        for (TravelAgencies t : taa){
            if (t.price > max){
                max = t.price;
            }
        }
        return max;
    }
    static TravelAgencies agencyDetailsforGivenIdandType(TravelAgencies[] taa, int regNo, String pType){
        for (TravelAgencies ta : taa){
            if (ta.flightFacility && ta.regNo == regNo && ta.pakageType.toLowerCase().equals(pType.toLowerCase())){
                return ta;
            }
        }
        return null;
    }
}
