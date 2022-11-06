
class Outer{


    class Inner{

     public  void  show(){

         System.out.println("hello");
     }
    }

    static class StaticInner{


    }

}

public class InnerClass {

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner= outer.new Inner();

        Outer.StaticInner staticInner= new Outer.StaticInner();

    }
}
