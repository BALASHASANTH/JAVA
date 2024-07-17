
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Mammal extends Animal {
    void walk() { 
        System.out.println("Walking...");
    }
}

interface Carnivore {
    void hunt();
}

interface Herbivore {
    void graze();
}

class Bear extends Mammal implements Carnivore, Herbivore {
   
    public void hunt() {
        System.out.println("Hunting...");
    }

   
    public void graze() {
        System.out.println("Grazing...");
    }
}

public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear();
        
        bear.eat();  
        bear.walk();   
        bear.hunt();   
        bear.graze(); 
    }
}
