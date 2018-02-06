package xyz.dodo;

import xyz.dodo.entity.PubgData;
import xyz.dodo.pubg.PUBG;

public class Main {
    public static void main(String[] args) {
        PUBG pubg = new PUBG("YOUR-API-KEY");
        PubgData data = pubg.getPlayerInfo("NickName");
        if (data.getResult().isOk()){
            System.out.println(data.getId());
            System.out.println(data.getPlayer());
            System.out.println(data.getLeagues());
        }
        else {
            System.out.println(data.getResult());
        }
    }
}
