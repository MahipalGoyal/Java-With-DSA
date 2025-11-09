public class herbicarni {
    public static void main(String []args) {
        Bear b = new Bear();
        b.eats();
    }
}

interface Herbivore {
    void eats(); 

    
}

interface Carnivore {
    void eats(); 
}

class Bear implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("Bear is both Herbivore and carnivore");
    }
}