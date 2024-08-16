/**
 * InnerHello
 */
class Calculator{
    int a;
    public int add(){
        System.out.println("add is called");
        return 0;
    }

}


class Hello{
    public static void main(String args[]){

        Calculator cal = new Calculator();
        cal.add();
        int num[]= {1, 2, 3};
        int arr1[] = new int[4];

        int arr2[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr2[i][j] =(int)(Math.random()*100);
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        for(int n[]: arr2){
            for(int a : n){
                System.out.print(a+" ");
            }
            System.err.println();
        }
        

        int arr3[][] = new int[3][]; // jagged
        for(int i = 0; i<3; i++){
            arr3[i] = new int[i+2];
        }
        for(int i = 0; i<arr3.length; i++){
            for(int a : arr3[i]){
                System.out.print(a+" ");
            }
            System.out.println();
        }


        int arr4[][][] = new int[2][][];


        String str = new String("Prashant");
        System.out.println(str.hashCode());
        System.out.println(str.charAt(1));
        System.out.println(str.concat(" Kumar"));
        String str1 = "Navin";
        str1 = str + str1;
        String s1 = "Kumar";
        String s2 = "Kumar";
        System.out.println(s1 == s2); // true

        // Immutable String
        // Mutable String

        StringBuffer sb = new StringBuffer("Prashant");

        System.out.println(sb.capacity());


        sb.append(" Kumar");
        sb.insert(0, "Java ");
        System.out.println(sb);



        int num1 = 0;
        byte by = 127;
        short sh = 558;
        long l = 38393l;
        float f = 5.8f;
        double d = 5.8;
        char c = 'k';
        boolean b = true;
        System.out.println("Hello");

        int num2 = 0b1010; // binary number
        int num3 = 0x7E; // Hexadecimal
        System.out.println(num2);
        System.out.println(num3);

        int num4 = 10_00_00_000;
        System.out.println(num4);

        double num5 = 12e10;
        System.out.println(num5);

        byte a = 127;
        int bc = 257;
        a = (byte)bc; // bc%256 
        System.out.println(a);

        byte a1 = 10;
        byte b1 = 30;
        int resutl  = a1*b1;
        System.out.println(resutl);

        int n = 1;
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            default:
                throw new AssertionError("Range upside");
        }
        while(n<2){
            System.out.println(n);
            n++;
        }
        do{
            System.out.println(n);
            n++;
        }while(n<2);

        for (int i = 0; i < 2; i++) {
            System.out.println("Hi "+i);
        }


    }
}



