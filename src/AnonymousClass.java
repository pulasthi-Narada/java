
class People{

    void talk(){
      System.out.println("people");
    }

}

public class AnonymousClass {

    public static void main(String[] args) {

        People people = new People(){
            @Override
            void talk(){
                System.out.println("no people");
            }
        };

        people.talk();


    }
}
