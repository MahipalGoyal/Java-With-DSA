public class HomeworkInheritance {
    public static void main(String[] args) {
        Human Mahi = new Human();
        Mahi.eat();
    }
}


class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
}

class Fish extends Animal {
    int fins;
    System.out.println("fins");

}
class Tuna extends Fish {
    void color() {
        System.out.println("color");
    }
}


class Shark extends Fish {
    void color();
    System.out.println("color");
}


class Bird extends Animal {
    int breed;
}

class Peacock extends Bird {
    String fly;
}
class Mammals extends Animal {
    String Breed;
}
class Dog extends Mammals {
    String Bark;
}
class Cat extends Mammals {
    String Meow;
}
class Human extends Mammals {
    int legs;
}