package xyz.dodo.parser;

import xyz.dodo.entity.League;
import xyz.dodo.entity.Player;
import xyz.dodo.entity.PubgData;
import xyz.dodo.entity.Stats;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class JSONParser {
    public static PubgData getDataFromJSON(String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);

            JSONArray leagues = jsonObject.getJSONArray("stats");
            ArrayList<League> leaguesArray = new ArrayList<>();

            for (int i = 0; i < leagues.length(); i++) {
                ArrayList<Stats> statsArray = new ArrayList<>();
                JSONObject league = leagues.getJSONObject(i);
                JSONArray stats = league.getJSONArray("stats");

                for (int j = 0; j < stats.length(); j++) {
                    JSONObject stat = stats.getJSONObject(j);
                    statsArray.add(new Stats(stat.getString("label"), stat.getString("category"), stat.getString("field"), stat.getString("value")));
                }

                leaguesArray.add(new League(league.getString("region"), league.getString("season"), league.getString("mode"), statsArray));
            }

            Player player = new Player(jsonObject.getString("accountId"), jsonObject.getString("nickname"), jsonObject.getString("avatar"));
            return new PubgData(jsonObject.getInt("pubgTrackerId"), player, leaguesArray);
        }
        catch (Exception e){
            return new PubgData();
        }
    }
}
