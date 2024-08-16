
interface A{
    int age = 44; // they are static and final
    String area = "Gaya";
    void show();
    void config();
}
interface B extends A, C{
    void run();
}

interface C{
    void t();
}
class Classb implements A, C{
    public void show(){
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }

    public void t() {
        System.out.println("In t");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Classb obj = new Classb();
        obj.config();
        A obj1;
        System.out.println(A.age); 
        obj1 = new Classb();
        obj1.show();
        obj1.config();
        C obj2 =  new Classb();
        obj2.t();

    }
}
