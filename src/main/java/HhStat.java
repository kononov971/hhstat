import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;


public class HhStat {
    public static void main(String[] args) throws IOException {


        System.out.println(hhRequest("java"));
    }

    public static String hhRequest(String text) throws IOException {
        URL url = new URL("https://api.hh.ru/vacancies?clusters=true&only_with_salary=true&enable_snippets=true&st=searchVacancy&text=" + text + "&search_field=name&per_page=100&area=1");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuffer response = new StringBuffer();

        while((line = reader.readLine()) != null) {
            response.append(line);
        }

        return response.toString();
    }
}
