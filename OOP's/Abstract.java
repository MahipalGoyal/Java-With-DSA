public class Abstract {
    public static void main(String [] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);


        Chicken C = new Chicken();
        C.eat();
        C.walk();


        Mustang myHorse = new Mustang();

        
    }
}
abstract class Ani {
    String color;


    Ani(){
        System.out.println("animal constructor called");
    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();

}

class Horse extends Ani {
    Horse() {
        System.out.println("Horse consructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}


class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Ani {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}