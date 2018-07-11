import java.util.List;

public class TwitterTrends {
    List<Trend> trends;

    class Trend {
        public String name;
        public String url;
        public String promotedContent;
        public String query;
        public int tweetVolume;
    }
}
