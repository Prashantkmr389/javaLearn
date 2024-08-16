

class Mobile{
    String brand;
    int price;
    static String name;

    Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    static{
        name = "Phone";
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(){
        System.out.println("Static Method");
        // You can use static variable inside static method 
    }
}

class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
    public  void setAge(int age){
        this.age = age;
    }
}

class A{
    // public A(){
    //     System.out.println("in a default");
    //     // every class extends Objects class  so supper can be called
    // }
    // public A(int a){
    //     System.out.println("in paramaterized a");
    // }
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("In a config");
    }
    public void show2(){
        System.out.println("In a show 2");
    }
}


// Multiple inheritance don't work in Java

class B extends A{
    // public B(){
    //     System.out.println("in b Default");
    //     // by default super is called in each constructed
    //     // super();

    // }
    // public B(int b){
    //     this();  // will call default constructor
        
    //     System.out.println("in b paramaterized");
    // }
    public void show(){
        System.out.println("In B show");
    }
    public void show1(){
        System.err.println("In b Show1");
    }
    
}

class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}



abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play Music");
    }
}

abstract class Wagonr extends Car{
    public void drive(){
        System.out.println("Driving Wagonr ....");
    }
}
class UpdatedWagonr extends Wagonr{

  
    public void fly() {
        System.out.println("Flying..");
    }
    
}


class ParentC{
    int age;
    public void show(){
        System.out.println("In show");
    }
    class ChildC{
        public void config(){
            System.out.println("In config");
        }
    }
}

public class Objects {
    
    public static void main(String[] args) {


        Car carobjc = new Car() {
            public void drive(){
                System.out.println("in anonymours abstract class implementing show");
            }
            public void fly(){
                System.out.println("in anonymours abstract class implementing fly");
            }
        };
        carobjc.drive();
        carobjc.fly();


        ParentC parobj = new ParentC();
        parobj.show();
        ParentC.ChildC childobj = parobj.new ChildC();
        childobj.config();

        Car carobj = new UpdatedWagonr();
        carobj.drive();
        carobj.playMusic();
        carobj.fly();

        A objanew = new A(){
            public void show(){
                System.out.println("In new show"); // Anonymous class
            }
        };

        objanew.show();

        
        // Mobile m1 = new Mobile("Hello", 20);
        // m1.brand = "Apple";
        // m1.price = 120;
        // Mobile.name = "SmartPhone";
        // Mobile m2 = new Mobile("Apple", 200);
        // m2.brand = "Apple";
        // m2.price = 120;
        // m1.show();
        // m2.show();

        // new A(); // anonymous oobject
        // AdvCalc cal = new AdvCalc();
        // cal.add(8, 9);
        // cal.mult(9, 10);
        B b1 = new B();
        b1.show();
        A obj = new B();
        obj.show();
        obj = new A();
        obj.show();


        final int num = 8; 



        A obja=(A) new B(); //Upcasting
        B objb = (B) obja; // downcasting
        obja.show2();
        objb.show();


        
        // num = 9; can't assing bacause it is constant


        int n = 7;
        Integer num1 = n;  // = new Integer(n);
        int num2 = num1; // = num1.valueInt();
        String str = "12";
        int num3 = Integer.parseInt(str);


        




        
    }

}

