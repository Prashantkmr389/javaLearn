// class var{
// } reserved for local variable

sealed class A permits B, C{

}

final class B extends A{

}

non-sealed class C extends A{

}

class D{

}

class RecordClass{
    private int id = 1;
    private String name = "hello";
    public RecordClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RecordClass other = (RecordClass) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "RecordClass [id=" + id + ", name=" + name + "]";
    }

}

/**
 * InnerNewIn
 */
record InnerNewIn(int id, String name) {

}


public class NewIn{
    // var x = 10;  erro only local variable
    public static void main(String []args){
        var x = 10;
        var nums = new int[10];
        var obj = new A();
        String var = "hello";
        RecordClass obj1 = new RecordClass(1, "Prashant");
        RecordClass obj2 = new RecordClass(1, "Prashant");
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1);
        InnerNewIn a = new InnerNewIn(2, "Nikhil");
        InnerNewIn b = new InnerNewIn(2, "Nikhil");
        System.out.println(a.equals(b));
        System.out.println(a);

    }
}