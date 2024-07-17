public class Bank{
    public static void main(String args[]){
        sbi s=new sbi();
        canara c=new canara();
        System.out.println(s.roi());
        System.out.println(c.roi());
    }
}
abstract class ban{
   abstract int roi();
}
class sbi extends ban{
    int roi(){
        return 1500;
    }
}
class canara extends ban{
    int roi(){
        return 2000;
    }
}
