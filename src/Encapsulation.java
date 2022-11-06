
class Van{

  private   double speed;
  private String name;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Encapsulation {

    public static void main(String[] args) {
        Van v = new Van();
        v.setName("pulasthi narada");
        v.getName();

    }


}
