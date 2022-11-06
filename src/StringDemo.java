import java.nio.DoubleBuffer;

public class StringDemo {

    public static void main(String[] args) {
        String a="a";
        String b="a";
        String c = new String("a");

        StringBuffer d = new StringBuffer("a");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));

        System.out.println(a.equals(d));

      Integer num =100;
      Integer num2 =100;

      Integer num3 = new Integer(100);

      Integer num4 = new Integer(100);


        Double d1 =1.0;
        Double d2 =1.0;

        System.out.println(num.equals(num));
        System.out.println(num==num2);

        System.out.println(num==num3);
        System.out.println(num4==num3);

//        System.out.println(d1.equals(d2));
//        System.out.println(d1==d2);




    }
}
