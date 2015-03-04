import com.mashape.unirest.http.Headers;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by XelnectMobileUser on 3/4/2015.
 */
public class mashapeYodaApi {
    public static void main(String[] args) {
// These code snippets use an open-source library. http://unirest.io/java
        try {
            HttpResponse<String> response = Unirest.get("https://yoda.p.mashape.com/yoda?sentence=You+will+learn+how+to+speak+like+me+someday.++Oh+wait.")
                    .header("X-Mashape-Key", "wuy8RRVeaymsheipYP4cuiv3YKHTp1GtGIMjsnp2JsM73Qc0W6")
                    .header("Accept", "text/plain")
                    .asString();
            System.out.print(response.getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }

    }

}
