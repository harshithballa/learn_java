import java.util.Scanner;

class NavalVessel{
    int vesselId;
    String vesselName;
    int noOfVoyagesPlanned, noOfVoyagesCompleted;
    String purpose;
    String classification;

    NavalVessel(int vi, String vn, int novp, int novc, String pu){
        this.vesselId = vi;
        this.vesselName = vn;
        this.noOfVoyagesPlanned = novp;
        this.noOfVoyagesCompleted = novc;
        this.purpose = pu;
        //this.classification = cl;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getVesselId(){
        return vesselId;
    }

    public void setVesselId(int vesselId){
        this.vesselId = vesselId;
    }
}
public class july03 {
    public static void main (String[] args){
        int vid, vvp, vvc, per;
        String vna, vpu, pur;
        NavalVessel[] nv = new NavalVessel[4];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<4; i++){
            vid = sc.nextInt();
            vna = sc.next();
            vvp = sc.nextInt();
            vvc = sc.nextInt();
            vpu = sc.next();
            nv[i] = new NavalVessel(vid,vna,vvp, vvc,vpu);
        }
        per = sc.nextInt();
        pur = sc.next();
        System.out.println(findAvgVoyagesByPct(nv, per));
        NavalVessel n = findVesselByGrade(pur, nv);
        if (n != null) {
            System.out.println(n.vesselName + "%" + n.classification);
        }
        else{
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
    }

    static double findAvgVoyagesByPct(NavalVessel[] nva, int percentage){
        double sumVoy=0, count = 0, res =0;
        for (NavalVessel n : nva){
            if (n.noOfVoyagesCompleted*100/n.noOfVoyagesPlanned > percentage ){
                sumVoy += n.noOfVoyagesCompleted;
                count +=1;
            }
        }
        res = sumVoy/count;
        return  (int)res;
    }

    static NavalVessel findVesselByGrade(String purpose, NavalVessel[] nva){
        double p;
        for (NavalVessel v: nva){
            if (v.purpose.toLowerCase().equals(purpose.toLowerCase())){
                p = (double)v.noOfVoyagesCompleted*100/v.noOfVoyagesPlanned;
                if (p == 100){
                    v.classification = "Star";
                }
                else if (p >= 80){
                    v.classification = "Leader";
                }
                else if (p >= 55){
                    v.classification = "Inspirer";
                }
                else {
                    v.classification = "Striver";
                }
                return v;
            }
        }
        return null;
    }
}
