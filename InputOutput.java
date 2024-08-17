
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException{
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);


        BufferedReader br = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            br.close();
        }

        try(BufferedReader bro = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(bro.readLine());
            System.out.println(num);
        }



    }
}
