
abstract class A{
int i;

 public void Show(){

  System.out.println("A");
}

    public void Print(){

        System.out.println("Print A");
    }


}

class  B extends A{
    @Override
    public void Show(){

        System.out.println("B");
    }

    public void Print(){

        super.Print();
        super.i=10;
        System.out.println("Print B");
    }

}


public class OverRideing {

    public static void main(String[] args) {

        B b = new B();
        b.Show();
        b.Print();

    }
}
