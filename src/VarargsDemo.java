public class VarargsDemo {
    static  void plus(int num1, int num2, int...nums){

        for(int i:nums){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        plus(1,2,3,4,5,6,7,8,9,10);


    }
}
