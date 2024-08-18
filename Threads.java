
class A extends Thread{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("Hi");
            try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("Hello");
            try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
}

class C implements Runnable{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("Godd mrng");
            try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
        
    }
}

public class Threads {
    public static void main(String []args){
        A obj1 = new A();
        B obj2 = new B();
        

        Runnable obj3 = new C();
        Thread t3 = new Thread(obj3);
        

        Runnable obj4 = new Runnable() {
            public void run(){
                for(int i = 0; i<=10; i++){
                    System.out.println("Without Class");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable obj5 = ()-> {
            for(int i = 0; i<=10; i++){
                System.out.println("Without Class Lamda Expression");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t4 = new Thread(obj4);
        Thread t5 = new Thread(obj5);


        
        obj1.start();
        // try {
        //     Thread.sleep(10);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        obj2.start();

        // try {
        //     Thread.sleep(10);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        t3.start();
        t4.start();
        t5.start();

    }


}
