
class X extends Thread{
   @Override
   public void run(){

       for(int i=0; i<5;i++){
         System.out.println("x");
           try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
       }
   }

}

class Y extends Thread{
    @Override
    public void run(){

        for(int i=0; i<5;i++){
            System.out.println("Y");
            try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }

}
class Z implements Runnable{
    @Override
    public void run(){

        for(int i=0; i<5;i++){
            System.out.println("Z");
            try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }

}


public class MultithreadingDemo  {
    public static void main(String[] args) throws Exception {

        X x = new X();
        Y y = new Y();

        Z z= new Z();





        // Anonymous Class
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<5;i++){
                    System.out.println("M");
                    try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
                }
            }
        };



        Thread t2 = new Thread(runnable);


        // Runnable interface is a FunctionalInterface, so we can use lambda expression
        Thread t3 = new Thread(()->{
            for(int i=0; i<5;i++){
                System.out.println("K");
                System.out.println(Thread.currentThread().getPriority());
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        },"t3");

        System.out.println(t2.getName());
        t2.setName("t2");
        System.out.println(t2.getName());
        System.out.println(t3.getName());

        //  Thread Priority 1 to 10 1 is less Priority. 5 is normal Priority. 10 is higher Priority
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t2.setPriority(1);
        t3.setPriority(10);

        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        x.start();
        y.start();

        Thread t1 = new Thread(z);

        t1.start();
        t2.start();
        t3.start();

        x.join();
        y.join();
        t1.join();
        t2.join();
        t3.join();




        System.out.println(t3.isAlive());
        System.out.println("Bye");


        System.out.println("active thread " + Thread.activeCount());
    }
}
