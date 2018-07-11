import java.util.Date;

public class YahooResponse {
    public Query query;

    class Query {
        public Date created;
        public int count;
        public String lang;
        public Result results;

        class Result {
            public Place place;

            class Place {
                public Locality locality1;
                public Locality locality2;

                class Locality {
                    public String woeid;
                }
            }
        }
    }
}
