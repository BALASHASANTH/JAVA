class multiin{
public static void  main(String args[]){
    mother m=new mother();
    brother b=new brother();
    sister s=new sister();
    m.disply1();
    m.disply2();
    b.disply3();
    s.disply4();

}
}
class father {
    String name="father";
    void disply1(){
        System.out.println("My name is : father");

    }
}
class mother extends father{
 
    void disply2(){
        System.out.println("My name is : mother");

    }
}
class brother extends mother{
    void disply3(){
        System.out.println("My name is : brother");

    }
}
class sister extends mother{
    void disply4(){
        System.out.println("My name is : sister ");

    }
}
