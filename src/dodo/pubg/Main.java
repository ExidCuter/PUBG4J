package dodo.pubg;

import dodo.pubg.entity.PubgData;
import dodo.pubg.pubg.PUBG;

public class Main {

    public static void main(String[] args) {

        PUBG pubg = new PUBG("Your-Api-Key");
        try {
            PubgData data = pubg.getPlayerInfo("Nickname");
            System.out.println(data.getId());
            System.out.println(data.getPlayer());
            System.out.println(data.getLeagues().get(0));
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
