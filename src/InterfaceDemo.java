
/*
Types of Interfaces
  Normal Interface
  Functional Interface - lambda expression only one method have
   Marker interface - no method have
 */

@
interface noMethod{

}

@FunctionalInterface
interface Writer{
    //  java 1.8 (java 8) can define final filed in interfaces
    int num =8;
   //  java 1.8 (java 8) can define static methods in interfaces
    static  void sayYes(){
        System.out.println("yes");
    }
    void write();

    //  java 1.8 (java 8) can define default methods in interfaces
    default void hello(){
        System.out.println("hello");
    }
    default void helloWorld(){
        System.out.println("hello world");
    }
}
class Pen implements Writer{

    @Override
    public void write() {
      System.out.println("pen");
    }
}

class Pencil implements Writer{

    @Override
    public void write() {
        System.out.println("pencil");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Writer pen = new Pen();

        pen.write();

        // Anonymous class

        Writer pencil = new Writer() {
            @Override
            public void write() {
                System.out.println("no pencil");
            }
        };

        pencil.write();

        //lambda expression
        Writer writer = () -> System.out.println("no writer");
        writer.write();

        //  java 1.8 (java 8) can define static methods in interfaces
        Writer.sayYes();



    }
}
