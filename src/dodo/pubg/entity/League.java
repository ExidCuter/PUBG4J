package dodo.pubg.entity;

import java.util.List;

public class League { //name by Oleksander
    public enum Region {
        na, eu, as, oc, sa, sea, krjp
    }
    public enum Mode {
        solo, duo, squad, solo_fpp, duo_fpp, squad_fpp
    }
    private Region region;
    private String season;
    private Mode mode;
    private List<Stats> stats;

    public Region getRegion() {
        return region;
    }

    public String getSeason() {
        return season;
    }

    public Mode getMode() {
        return mode;
    }

    public List<Stats> getStats() {
        return stats;
    }

    public League(String region, String season, String  mode, List<Stats> stats) {
        this.season = season;
        switch (region) {
            case "na":
                this.region = Region.na;
                break;
            case "eu":
                this.region = Region.eu;
                break;
            case "as":
                this.region = Region.as;
                break;
            case "oc":
                this.region = Region.oc;
                break;
            case "sa":
                this.region = Region.sa;
                break;
            case "sea":
                this.region = Region.sea;
                break;
            case "krjp":
                this.region = Region.krjp;
                break;
        }
        switch (mode) {
            case "solo":
                this.mode = Mode.solo;
                break;
            case "duo":
                this.mode = Mode.duo;
                break;
            case "squad":
                this.mode = Mode.squad;
                break;
            case "solo-fpp":
                this.mode = Mode.solo_fpp;
                break;
            case "duo-fpp":
                this.mode = Mode.duo_fpp;
                break;
            case "squad-fpp":
                this.mode = Mode.squad_fpp;
                break;
        }
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "League{" +
                "region=" + region +
                ", season='" + season + '\'' +
                ", mode=" + mode +
                ", stats=" + stats +
                '}';
    }
}
