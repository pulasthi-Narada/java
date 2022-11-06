class C{

    public  void show(){

        System.out.println("C");
    }

}

class D extends  C{

    public  void show(){

        System.out.println("D");
    }

}

class E extends  C{

    public  void show(){

        System.out.println("E");
    }

}



public class DynamicMethodDispatch {

    public static void main(String[] args) {

        C c = new D(); // runtime polymorphism

        c.show();

        c = new E();

        c.show(); // Dynamic Method Dispatch

    }
}
