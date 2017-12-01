package dodo.pubg.entity;

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
