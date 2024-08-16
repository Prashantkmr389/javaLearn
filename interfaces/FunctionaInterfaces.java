

@FunctionalInterface // Only contain one method
interface A{
    void show(int x);
   
}

class B implements A{
    public void show(int i){
        System.out.println("in B show");
    }
}

@FunctionalInterface
interface LamdaClass{
    int add(int i, int j);
}

public class FunctionaInterfaces {
    public static void main(String[] args) {

        A objA = new A() {
            public void show(int x){
                System.out.println("in A anonymous show");
            }
        };

        A obj1A = (i) -> System.out.println("in anonymous show by lamda express "+i );

        obj1A.show(5);
        objA.show(4);


        A obj2A = i -> System.out.println("in anonymous show by lamda expression "+i);
        obj2A.show(6);


        LamdaClass objLamdaClass = new LamdaClass() {
            public int add(int i, int j){
                return i+j;
            }
        };

        LamdaClass objLamdaClass1 = (i, j)-> i+j;
        System.out.println(objLamdaClass.add(1, 2));
    }

}
