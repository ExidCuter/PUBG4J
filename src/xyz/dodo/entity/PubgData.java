package xyz.dodo.entity;

import java.util.ArrayList;
import java.util.List;

public class PubgData {
    int id;
    Player player;
    List<League> leagues;

    public int getId() {
        return id;
    }

    public Player getPlayer() {
        return player;
    }

    public List<League> getLeagues() {
        return leagues;
    }

    public League getLeague(League.Region region, League.Mode mode) {
        for (League league : leagues) {
            if (league.getRegion() == region && league.getMode() == mode){
                return  league;
            }
        }
        return new League();
    }

    public PubgData(){
        id = -999999;
        player = new Player("unknown", "No Data", "Error");
        leagues = new ArrayList<>();
    }

    public PubgData(int id, Player player, List<League> leagues) {
        this.id = id;
        this.player = player;
        this.leagues = leagues;
    }

    @Override
    public String toString() {
        return "PubgData{" +
                "id=" + id +
                ", player=" + player +
                ", leagues=" + leagues +
                '}';
    }
}
