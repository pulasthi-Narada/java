import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author pulasthi narada
 */
class Student{
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
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

        Stream<String> stream = names.stream();
        stream.sorted().forEach(System.out::println);

        int[] numbers = {22,1,5,3,9,6,722,8,1,9};
        Arrays.stream(numbers).sorted().forEach(System.out::println);

        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        Student student2 = new Student();
        student.setName("bb");
        student.setAge(12);
        student2.setName("aa");
        student2.setAge(22);

        studentList.stream().map(s->{
         return s;
        }).forEach(student1 -> System.out.println(student1.getName()));



    }

    public static void main(String[] args) {
        test();
    }
}
