import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author pulasthi narada
 */
public class TryWithResource {

    public  void test(){

        try(BufferedReader bufferedReader = new BufferedReader(new StringReader("hello world"));
            StringWriter stringWriter = new StringWriter();
        ){
            System.out.println("");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
