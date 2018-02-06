package xyz.dodo.entity;

import java.util.ArrayList;
import java.util.List;

public class PubgData {
    int id;
    Player player;
    List<League> leagues;
    SuccessCode result;

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

    public SuccessCode getResult() {
        return result;
    }


    public PubgData(SuccessCode result){
        id = -999999;
        player = new Player("unknown", "No Data", "Error");
        leagues = new ArrayList<>();
        this.result = result;
    }

    public PubgData(int id, Player player, List<League> leagues, SuccessCode result) {
        this.id = id;
        this.player = player;
        this.leagues = leagues;
        this.result = result;
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
