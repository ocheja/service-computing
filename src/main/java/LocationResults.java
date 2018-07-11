import java.util.List;

public class LocationResults {
    public List<Address> results;

    class Address {
        public Geometry geometry;

        class Geometry {
            public Location location;

            class Location {
                public String lat;
                public String lng;
            }
        }
    }
}
