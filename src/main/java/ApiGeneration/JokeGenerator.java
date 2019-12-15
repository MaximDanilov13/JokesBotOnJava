package ApiGeneration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class JokeGenerator {

    public static String readFromUrl(String url) throws IOException, JSONException {
        URL obj = new URL(url);

        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "WINDOWS-1251"));

        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null)
            response.append(inputLine);

        String jsonText = response.toString();
        JSONObject json = new JSONObject(jsonText);
        return (String) json.get("content");
    }
}