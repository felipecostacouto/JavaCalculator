import java.util.Scanner;

public class Main {
    public static void sum(float x,float y){
        float resultsum = x+y;
        System.out.println("RESULT: "+ resultsum);
    }

    public static void divide(float x, float y){
        float resultdiv = x/y;
        System.out.println("RESULT: "+ resultdiv);
    }

    public static void multiply(float x, float y){
        float resultmultiply = x*y;
        System.out.println("RESULT: "+ resultmultiply);
    }

    public static void subtract(float x, float y){
        float resultsub = x-y;
        System.out.println("RESULT: "+ resultsub);
    }

    public static void main(String[] args) {
        System.out.println("Give 2 number to do the operations");
         Scanner sc = new Scanner(System.in);
         String op;
         do {
             System.out.println("Give the x float value");
             float x = sc.nextFloat();
             System.out.println("Give the y float value");
             float y = sc.nextFloat();
             System.out.println("Which operation do you want to make SUM, MULTIPLY, DIVIDE or SUBTRATION");
             op = sc.next();
             if(op.equals("SUM")){
                 sum(x,y);
             }
             if(op.equals("MULTIPLY")){
                 multiply(x,y);
             }
             if(op.equals("DIVIDE")){
                 divide(x,y);
             }
             if(op.equals("SUBTRATION")){
                 subtract(x,y);
             }
             System.out.println();
             System.out.println("Do you wish to make another operation? S/N");
             op = sc.next();
             if(op.equals("S")){
                 System.out.println("New Operation next");
             } else{
                System.out.println("input EXIT to leave");
                 op = sc.next();
             }
         }
         while(!op.equals("EXIT"));
    }

}

