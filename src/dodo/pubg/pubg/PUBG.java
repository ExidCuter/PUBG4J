package dodo.pubg.pubg;


import dodo.pubg.entity.PubgData;
import dodo.pubg.parser.HTTPParser;
import dodo.pubg.parser.JSONParser;

public class PUBG {
    private String apiKey;

    public PUBG(String apyKey) {
        this.apiKey = apyKey;
    }
    public PubgData getPlayerInfo(String nickname) throws Exception {
        return JSONParser.getDataFromJSON(HTTPParser.getStatsfromNickname(nickname,apiKey));
    }
}
