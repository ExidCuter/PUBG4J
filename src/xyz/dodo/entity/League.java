package xyz.dodo.entity;

import java.util.ArrayList;
import java.util.List;

public class League { //name by Oleksander
    public enum Region {
        na, eu, as, oc, sa, sea, krjp, unknown
    }

    public enum Mode {
        solo, duo, squad, solo_fpp, duo_fpp, squad_fpp, unknown
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

    public League(String region, String season, String mode, List<Stats> stats) {
        this.season = season;
        this.region = getRegionFromString(region);
        this.mode = getModeFromString(mode);
        this.stats = stats;
    }

    public League() {
        this.season = "Error";
        this.region = Region.unknown;
        this.mode = Mode.unknown;
        this.stats = new ArrayList<>();
    }

    public static Mode getModeFromString(String mode) {
        switch (mode) {
            case "solo":
                return Mode.solo;
            case "duo":
                return Mode.duo;
            case "squad":
                return Mode.squad;
            case "solo-fpp":
                return Mode.solo_fpp;
            case "duo-fpp":
                return Mode.duo_fpp;
            case "squad-fpp":
                return Mode.squad_fpp;
        }
        return Mode.unknown;
    }

    public static Region getRegionFromString(String region) {
        switch (region) {
            case "na":
                return Region.na;
            case "eu":
                return Region.eu;
            case "as":
                return Region.as;
            case "oc":
                return Region.oc;
            case "sa":
                return Region.sa;
            case "sea":
                return Region.sea;
            case "krjp":
                return Region.krjp;
        }
        return Region.unknown;
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
