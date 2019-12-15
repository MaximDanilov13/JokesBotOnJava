package Tools;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;

public class JsonFileRead
{
    public static JSONObject baseData;

    public static JSONObject fileRead(String fileName) throws IOException, JSONException {
        StringBuilder jokesBase = new StringBuilder();
        BufferedReader buffReader = new BufferedReader(new java.io.FileReader(fileName));

        while (buffReader.ready())
            jokesBase.append(buffReader.readLine());

        return new JSONObject(jokesBase.toString());
    }

    public static String getContent(String type) {
        try {
            JSONArray qw = (JSONArray) baseData.get(type);
            return (String) qw.get((int) (Math.random() * 15));

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
