package convertidor_monedas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

public class Convertidor {
    public static double convert(double amount, String from, String to) {
        double conversion = 0;

        try {
            URL url = new URL("https://free.currconv.com/api/v7/convert?q=" + from + "_" + to + "&compact=ultra&apiKey=24467edc03f8560808f4");
            URLConnection urlConnection = url.openConnection();
            BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                urlConnection.getInputStream()));

            String inputLine = in.readLine();

            JSONObject object = new JSONObject(inputLine);

            conversion = object.getDouble(from + "_" + to);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return conversion*amount;
    }
}