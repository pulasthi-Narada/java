import java.util.ArrayList;
import java.util.List;

/**
 * @author pulasthi narada
 */
public class StreamApi {

   static List<String> names = new ArrayList<>();

    public static   void test(){
        names.add("nara");
        names.add("narada");
        names.add("naved");
        names.add("ddd");
        names.add("aaa");
        names.add("cccc");

        names.stream().filter(s->s.startsWith("n")).filter(s-> s.endsWith("d")).forEach(System.out::println);

        //parallel Stream
        names.parallelStream().filter(s->s.startsWith("n")).filter(s-> s.endsWith("d")).forEach(System.out::println);
    }

    public static void main(String[] args) {
        test();
    }
}
