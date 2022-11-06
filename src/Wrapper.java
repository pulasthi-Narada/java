public class Wrapper {

    public static void main(String[] args) {

        int i =7; // primitive data types
       Integer n = new Integer(2); // boxing wrapping

        Integer n2 = new Integer(i);// boxing wrapping

        i = n.intValue(); // unboxing unwrapping


        i = n; // autoboxing autowrapping

        n2 = i; // autoboxing autowrapping

        String s = "123";

        Byte b = 127;

        Integer n3 = Integer.parseInt(s);


    }
}
