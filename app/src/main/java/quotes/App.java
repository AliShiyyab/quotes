package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;


public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonText0 = "{\"author\":\"Ali\",\"text\":\"Student0\"}";
        String jsonText1 = "{\"author\":\"Majd\",\"text\":\"Best Partner\"}";
        String jsonText2 = "{\"author\":\"Batool\",\"text\":\"TA's\"}";
        try {
            Reader reader = new FileReader("app/src/main/resources/data.json");
            int min = 0;
            int max = 137;
            Quotes q1 = gson.fromJson(jsonText0,Quotes.class);
            Quotes q2 = gson.fromJson(jsonText1,Quotes.class);
            Quotes q3 = gson.fromJson(jsonText2,Quotes.class);
            Quotes[] q4 = gson.fromJson(reader , Quotes[].class);
            int b = (int)(Math.random()*(max-min+1)+min);
            System.out.println(q1.toString());
            System.out.println(q2.toString());
            System.out.println(q3.toString());
            System.out.println(q4[2].toString());
            System.out.println(q4[b].toString());
            System.out.println("Object length = " + q4.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
