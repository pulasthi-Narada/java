
// multi level Inheritance
class Calculator{
    int num;
    int num2;
    public Calculator(int n, int n2){
        num =n;
        num2 =n2;


    }

    public void plus(){
        System.out.println(num+num2);
    }

}

class AdvancedCalculator extends Calculator {
String name;
    public AdvancedCalculator(int n, int n2, String name) {
        super(n, n2);
        this.name = name;
    }

    public void mines(){
        System.out.println(num-num2);
    }

}

class VeryAdvancedCalculator extends AdvancedCalculator {

    public VeryAdvancedCalculator(int n, int n2, String name) {
        super(n, n2,name);
    }

    public void mult(){
        System.out.println(num*num2);
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        VeryAdvancedCalculator cal = new VeryAdvancedCalculator(2,3,"pulasthi");

        cal.plus();
        cal.mines();
        cal.mult();

    }
}
