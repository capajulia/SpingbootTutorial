package caparrella.dam;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class JavaRestAPIMain {
    public static void main(String[] arg) throws Exception {
        URL wsurl = new URL ( "http://localhost:8080/api/info");
        URLConnection connection = wsurl.openConnection();

        if (connection instanceof HttpURLConnection) {
            HttpURLConnection httpConnection = (HttpURLConnection) connection;
            int responseCode = httpConnection.getResponseCode();

            if (responseCode == 200) {
                InputStreamReader isreader = new InputStreamReader(httpConnection.getInputStream());
                BufferedReader breader = new BufferedReader(isreader);
                String responseStr = "";
                String line=breader.readLine();

                while (line != null) {
                    responseStr += line;
                    line = breader.readLine();
                }
                breader.close();
                System.out.println(responseStr);

                JSONObject jsondata = new JSONObject(responseStr);
                System.out.println(jsondata.getString("title"));
                System.out.println(jsondata.getString("message"));
                System.out.println(jsondata.getString("ip"));
            }
        }
    }
}
