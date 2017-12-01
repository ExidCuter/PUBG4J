package dodo.pubg.parser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HTTPParser {
    public static String getStatsfromNickname(String nickname, String apiKey){
        try {
            URL url = new URL("https://api.pubgtracker.com/v2/profile/pc/" + nickname);
            URLConnection urlConn = url.openConnection();
            urlConn.setRequestProperty("User-Agent", "Mozilla/5.0");
            urlConn.setRequestProperty("TRN-Api-Key",apiKey);

            BufferedReader in = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
            return response.toString();
        }
        catch (Exception e){
            e.printStackTrace();
            return e.toString();
        }
    }
}
