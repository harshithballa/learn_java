import  java.util.Scanner;

class Player{
    int playerId;
    String skill;
    String level;
    int points;

    Player(int playerId, String skill, String level, int points){
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    public int getPlayerId(){
        return this.playerId;
    }
    public  void  setPlayerId(int playerId){
        this.playerId = playerId;
    }

    public String getSkill(){
        return  this.skill;
    }
    public void setSkill(String skill){
        this.skill = skill;
    }

    public String getLevel(){
        return this.level;
    }
    public void setLevel(String level){
        this.level = level;
    }

    public int getPoints(){
        return  this.points;
    }
    public void setPoints(int points){
        this.points = points;
    }
}
public class may08 {
    public static void main(String[] args){
        int pid, ppo;
        String psk, ple, cpl, cps;
        Player[] poa = new Player[4];
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<4; i++){
            pid = sc.nextInt();
            psk = sc.next();
            ple = sc.next();
            ppo = sc.nextInt();
            poa[i] = new Player(pid, psk, ple, ppo);
        }
        cps = sc.next();
        cpl = sc.next();
        int points = findPointsForGivenSkill(poa, cps);
        if (points > 0){
            System.out.println(points);
        }
        else{
            System.out.println("The given Skill is not available");
        }

        Player replayer = getPlayerBasedOnLevel(cpl, cps, poa);
        if (replayer != null){
            System.out.println(replayer.playerId);
        }
        else{
            System.out.println("No player is available with the specified level, skill and eligibility points");
        }
    }
    static int findPointsForGivenSkill(Player[] poa, String s){
        int sumP = 0;
        for (Player p : poa){
            if (p.skill.toLowerCase().equals(s.toLowerCase())){
                sumP += p.points;
            }
        }
        return sumP;

    }
    static Player getPlayerBasedOnLevel(String level, String skill, Player[] poa){
        for (Player p : poa){
            if (p.level.toLowerCase().equals(level.toLowerCase()) && p.skill.toLowerCase().equals(skill.toLowerCase()) && p.points >= 20){
                return p;
            }
        }
        return null;
    }
}
