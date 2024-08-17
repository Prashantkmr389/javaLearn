
enum Status{
    Running, Failed, Pending, Success;
}
enum Laptop{
    Macbook(200), XPS(2200), Surface(1500), Ideapad(200);
    private int price;
    private  Laptop(){
        price = 500;
    }
    private Laptop(int price){
        this.price = price;
        System.out.println("in this " + this.name());
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }




}

public class Enum {
   public static void main(String[] args) {

        Laptop lap = Laptop.Macbook;

        System.out.println(lap.getPrice());


        for(Laptop l : Laptop.values()){
            System.out.println(l + " "+ l.getPrice());
        }
        int i = 5;


        Status ss = Status.Running;
        System.out.println(ss);
        System.out.println(ss.ordinal());
        Status[] all = Status.values();
        for(Status s : all){
            System.out.println(s.ordinal() + " : " + s);
        }

        if(ss == Status.Running){
            System.out.println("All good");
        }
        else{
            System.out.println("Something wrong");
        }

        switch(ss){
            case Running -> System.out.println("All good");
            case Failed -> System.out.println("try again");
            case Pending -> System.out.println("Wait for it");
            default -> System.out.println("Come again");
        }
    }
}
