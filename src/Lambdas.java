import java.util.Random;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

/**
 * @author pulasthi narada
 */

@FunctionalInterface
interface Calculate{
    void plus(int x, int y);
}

@FunctionalInterface
interface HelloWorld{
    void sayHelloWorld();
}


public class Lambdas {

    public static void main(String[] args) {

        HelloWorld helloWorld = ()-> System.out.println("Hello Friend");
        helloWorld.sayHelloWorld();

        Calculate calculate = (int x, int y)-> {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            System.out.println(x+y+randomNumber);
        };
        calculate.plus(2,3);

        // --- Package java.util.function ----
        IntBinaryOperator plus = (int x, int y) -> x+y;
        System.out.println( plus.applyAsInt(2,2));

        Function<Integer, String> stringValue = String::valueOf;
        System.out.println(stringValue.apply(100));

    }




}
