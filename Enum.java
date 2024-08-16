
enum Status{
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
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
