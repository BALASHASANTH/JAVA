

class Hybride {
    public static void main(String[] args) {
        grandson g=new grandson();
        grandauter d=new grandauter();
        son s=new son();
        g.print();
        d.print();
        s.age();
        s.age1();
        s.name();
        s.name2();
    }
    
}

interface grandfather{
    void age();
}

interface father {
     void  name();  
}
class son implements grandfather,father{
    
   public void age(){
    System.out.println("age");
    }
    public void name(){
        System.out.println("name");
    }
    public void age1(){
        int age=20;
    System.out.println(age);
    }
   public  void name2(){
        String name="son";
        System.out.println(name);
    }
}
class grandson extends son{
    void print(){
        String name="GrandSon";
        System.out.println(name);
    }
}
class grandauter extends son{
    void print(){
        String name="Grandauter";
        System.out.println(name);
    }
}