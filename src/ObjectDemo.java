
 class Bike{

    int num;
    int num2;
    int res;

    public Bike(){
        num =1;
        num2 =2;

    }
     public Bike(int num){
         this.num =num;
         num2 =2;

     }
     public Bike(double num){
         this.num = (int)num;
         num2 =2;

     }
     public Bike(int num, int num2){
         this.num =num;
         this.num2 =num2;

     }

    public void plus(){

       res= num+num2;
    }


}

public class ObjectDemo {

    public static void main(String[] args) {
        //reference
        Bike b = new Bike(7);

        Bike b2 = new Bike(7,3);

        Bike b3 = new Bike(7.5);


        b.plus();
        System.out.println(b.res);

    }
}


