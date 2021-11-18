public class Person{
     private String name;
     private double maxHeight;
     private int maxRun;

     public Person(String name, double maxHeight, int maxRun) {
          this.name = name;
          this.maxHeight = maxHeight;
          this.maxRun = maxRun;
     }

     public void run(int distance){
          System.out.println("Человек пробежал " + distance);
     }

     public void jump(double height){
          System.out.println("Человек подпрыгнул на " + height +"м.");
     }

     public String getName() {
          return name;
     }

     public double getMaxHeight() {
          return maxHeight;
     }

     public int getMaxRun() {
          return maxRun;
     }

}
