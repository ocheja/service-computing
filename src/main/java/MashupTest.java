import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import java.util.Base64;

public class MashupTest {

    public static void main(String[] args) {
        MashupTest mashupTest = new MashupTest();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {

            // Get Latitude and longitude of Kyoto University.
            String place = "Kyoto University";
            HttpResponse<JsonNode> googleMapsResponse = Unirest.post("https://maps.googleapis.com/maps/api/geocode/json")
                    .queryString("address", place)
                    .queryString("key", "AIzaSyCao7aPmuLNx4mlYP8VfMH9TeZkVa6D91E")
                    .asJson();
            LocationResults locationResults = gson.getAdapter(LocationResults.class).fromJson(googleMapsResponse.getBody().toString());
            System.out.println("===============================================================================");
            System.out.println("                            GOOGLE MAPS LOCATION COORDINATES");
            System.out.println("===============================================================================");
            System.out.println(gson.toJson(googleMapsResponse.getBody()));
            if(locationResults!=null && locationResults.results.size() > 0) {
                // get Yahoo! Where On Earth ID (woeid) of the location = Kyoto University
                HttpResponse<JsonNode> yahooGeoplanetServiceResponse = Unirest.post("https://query.yahooapis.com/v1/public/yql")
                        .queryString("q", "select locality1.woeid from geo.places where text='("+locationResults.results.get(0).geometry.location.lat+","+
                                locationResults.results.get(0).geometry.location.lng + ")' ")
                        .queryString("diagnostics", false)
                        .queryString("format", "json")
                        .asJson();
                System.out.println("===============================================================================");
                System.out.println("                            YAHOO GEO PLACES");
                System.out.println("===============================================================================");
                System.out.println(gson.toJson(yahooGeoplanetServiceResponse.getBody()));
                YahooResponse yahooResponse = gson.getAdapter(YahooResponse.class).fromJson(yahooGeoplanetServiceResponse.getBody().toString());
                if(yahooResponse != null && yahooResponse.query.count > 0) {
                    HttpResponse<JsonNode> bearerTokenResponse = Unirest.post("https://api.twitter.com/oauth2/token")
                            .header("Authorization", "Basic "+mashupTest.getTwitterAuthCredentials())
                            .header("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                            .body("grant_type=client_credentials")
                            .asJson();
                    TwitterToken twitterToken = gson.getAdapter(TwitterToken.class).fromJson(bearerTokenResponse.getBody().toString());
                    System.out.println("===============================================================================");
                    System.out.println("                            TWITTER BEARER TOKEN");
                    System.out.println("===============================================================================");
                    System.out.println(gson.toJson(bearerTokenResponse.getBody()));
                    if(twitterToken != null && twitterToken.access_token != null) {
                        // get the trending tweets in Kyoto University
                        HttpResponse<JsonNode> twitterTrendsResponse = Unirest.get("https://api.twitter.com/1.1/trends/place.json")
                                .header("Authorization", "Bearer " + twitterToken.access_token)
                                .queryString("id", yahooResponse.query.results.place.locality1.woeid)
                                .asJson();
                        System.out.println("===============================================================================");
                        System.out.println("                            TRENDING TWEETS");
                        System.out.println("===============================================================================");
                        System.out.println(gson.toJson(twitterTrendsResponse.getBody()));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public String getTwitterAuthCredentials() {
        return Base64.getEncoder().encodeToString("kMWq3xmFH1xUZEIlHiTRSFfFG:YOx3NUoDSlQWWv8SCe4PI7G1aW2OWdAUHq6xzTw72wGvoAPhKk".getBytes());
    }


}
