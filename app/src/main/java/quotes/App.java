package quotes;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public static void main(String[] args) {

        String apiUrl = "https://api.quotable.io/random";
        try {
            Gson gson1 = new Gson();
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            int status = connection.getResponseCode();

            if (status == 200) {
                InputStream inputStream = connection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line = bufferedReader.readLine();
                Quotes q1 = gson1.fromJson(line, Quotes.class);
                System.out.println("From API");
                System.out.println(q1.toString());
//                try {
//                    FileWriter myWriter = new FileWriter("app/src/main/resources/data.json",true);
//                    myWriter.write(q1.toString()+"/n");
//                    myWriter.close();
//                    System.out.println("Successfully wrote to the file.");
//                } catch (IOException e) {
//                    System.out.println("An error occurred.");
//                    e.printStackTrace();
//                }

                bufferedReader.close();
            } else {
                Gson gson = new Gson();
                try {
                    Reader reader = new FileReader("app/src/main/resources/data.json");
                    Quotes[] q1 = gson.fromJson(reader, Quotes[].class);
                    int min = 0;
                    int max = q1.length - 1;
                    int b = (int) (Math.random() * (max - min + 1) + min);
                    System.out.println("from local file");
                    System.out.println(q1[b].toString());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }

            connection.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}