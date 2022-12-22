import java.util.ArrayList;
import java.util.List;

/**
 * @author pulasthi narada
 */
@FunctionalInterface
interface AA{
    public String test();

}
class av {

}
public class LambdaExpression {
    List<String> s = new ArrayList<>();



    public void test(){

        s.forEach(s-> System.out.println(s));
        //Method Reference
        s.forEach(System.out::println);

    }
}
