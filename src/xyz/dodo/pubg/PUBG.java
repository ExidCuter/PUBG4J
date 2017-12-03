package xyz.dodo.pubg;


import xyz.dodo.entity.PubgData;
import xyz.dodo.parser.HTTPParser;
import xyz.dodo.parser.JSONParser;

public class PUBG {
    private String apiKey;

    public PUBG(String apyKey) {
        this.apiKey = apyKey;
    }
    public PubgData getPlayerInfo(String nickname) {
        return JSONParser.getDataFromJSON(HTTPParser.getStatsfromNickname(nickname,apiKey));
    }

}
