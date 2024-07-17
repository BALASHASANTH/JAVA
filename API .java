interface API {
    
    default void show()
    {

        System.out.println("Default API");
    }
}


interface Interface1 extends API {
    void display();
}


interface Interface2 extends API {
    // Abstract method
    void print();
}

class TestClass implements Interface1, Interface2 {
    public void display()
    {
        System.out.println("Display from Interface1");
    }
  
    public void print()
    {
        System.out.println("Print from Interface2");
    }
 
    public static void main(String args[])
    {
       
        TestClass d = new TestClass();

        
        d.show(); 
        d.display(); 
        d.print(); 
    }
}