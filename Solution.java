import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.err.println("Zero can't be divisor");
        }finally{
            System.out.println("The program run successfully");
        }
        sc.close();

    }
}
