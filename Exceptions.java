

class CustomException extends Exception{
    public CustomException(String mess){
        super(mess);
    }
}


class A{
   
    public void show() throws ClassNotFoundException{
    
        Class.forName("Calc");
    }
}

public class Exceptions {
    public static void main(String[] args) {
        
        int j = 0;
        int i = 1;
        int nums[] = new int[5];
        try {
            j = j/i;
            if(j== 0){
                throw new CustomException("You are sending the wrong thing");
                // throw new ArithmeticException("Don't send 0");
            }
                
            
            int num = nums[5];

        } 
        catch(CustomException e){
            System.out.println("Dekhe bhai mera exception"+e);
        }
        catch (ArithmeticException e) {
            j = 18/1;

            System.out.println("Cannot divide by zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        catch (Exception e){
            System.out.println(e);
        }
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
