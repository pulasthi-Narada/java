
abstract class Human{

    public abstract void eat();

    public void walk(){

    }
    public void age(Number age){
        System.out.println(age);
    }
}

class Man extends Human{

    @Override
    public void eat() {

    }


    public void higth(Number higth){
        System.out.println(higth);
    }

}

public class AbstractDemo {
    public static void main(String[] args) {

        Human man = new Man();

        man.age(2.4);




    }
}
