import java.util.*;
class Smallest{
public static void  main(String argss[]){
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int n=sc.nextInt();
    int b=s-1,c=10;
    for(int i=2;i<n;i++){
        c*=10;
    }
    c+=b;
    System.out.println(c);
    sc.close();
}

}