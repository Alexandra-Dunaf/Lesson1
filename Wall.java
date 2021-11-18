public class Wall {
    private String name;
    private double height;

    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Стенка (" + name + ") высотой: " + height +"м.";
    }
}
