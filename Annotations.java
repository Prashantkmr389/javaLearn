

class A{
    public void shows(){
        System.out.println("will override this later");
    }
}
class B extends A{
    @Override // will show compile time error if not done properly
    public void shows(){
        System.out.println("Have overriden this");
    }
}


public class Annotations {
    public static void main(String[] args) {
        B objb = new B();
        objb.shows();
    }
}
