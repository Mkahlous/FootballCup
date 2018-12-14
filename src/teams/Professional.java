package teams;

public class Professional extends Teams {
    public final String playerLevel1 = "Professional";

    public Professional (String clubName,String playerLevel1){
        this.setClubName(clubName);
        this.setClubCategory(playerLevel1);
    }
}
