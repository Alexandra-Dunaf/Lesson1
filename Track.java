public class Track {
    private String name;
    private int distance;

    public Track(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Беговая дорожка (" + name + " забег на дистанцию: " + distance +"м.";
    }
}
