
class Emp{

    int id;
    int salary;
   static String ceo;

    static { // when you load a class

        ceo ="pulasthi";
       System.out.println("static");
    }

    public Emp(){ // when you create objects
        id =1;
        salary =10000;

        System.out.println("constouter");
    }

    public  void show(){
        System.out.println(id + " " + salary + "" + ceo);
    }
    public static void showCeo(){
        System.out.println( ceo);
    }


}


public class StaticKeyWord {
    public static void main(String[] args) {

        Emp emp = new Emp();
        Emp emp2 = new Emp();

        Emp.ceo ="narada";

        Emp.showCeo();


    }
}
