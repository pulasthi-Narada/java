
class Dog{


}


public class ArrayDemo {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        Dog dogArray[]= {d1,d2,d3};

        int numbers[] = new int[3];



        Integer n[]= new Integer[3];
        n[0]=1;

        int numbers2[] = {1,2,3,4};

        int numbers3[][] = {{1,2,3,4},{1,2,3,4}};

        int numbers4[][] = new int[2][2];



        for(int i:numbers2){
            System.out.println(i);

        }

        for(int i[]:numbers3){
            for(int j :i) {
                System.out.println(j);
            }
        }





    }
}
