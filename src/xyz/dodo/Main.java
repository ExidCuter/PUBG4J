package xyz.dodo;

import xyz.dodo.entity.PubgData;
import xyz.dodo.pubg.PUBG;

public class Main {
    public static void main(String[] args) {
        PUBG pubg = new PUBG("Your-Api-Key");
        PubgData data = pubg.getPlayerInfo("Nickname");
        System.out.println(data.getId());
        System.out.println(data.getPlayer());
        System.out.println(data.getLeagues());
    }
}
