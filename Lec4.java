public class Lec4 {
    public static void main(String args[]) {
        Animal n1 = new Animal();
        n1.makeSound();
        n1.makeSound("Dog", "Bark");
        n1.display();

        Cat c1 = new Cat("cat1", "Mew", 4);
        c1.makeSound();
        c1.makeSound();

        Animal c2 = new Cat("cat1", "Mew", 4);   //upCasting
        c2.makeSound();
        c2.display(); //understand it properly
    }
}
class Animal {
    String name;
    String sound;
    void makeSound() {
        System.out.println("This is Animal class");
    }
    void makeSound(String name, String sound) {
        String result = String.format("Name=%s and Sound=%s", name, sound);
        System.out.println(result);
    }
    void display() {
        String result = String.format("Name=%s and Sound=%s", name, sound);
        System.out.println(result);
    }
}
class Cat extends Animal {
    int legs;
    Cat(String name, String sound, int legs) {
        super.name = name;
        super.sound = sound;
        this.legs = legs;
    }
    @Override
    void makeSound() {
        String result = String.format("Name=%s and Sound=%s and Legs=%d" , name, sound, legs);
        System.out.println(result);
        //System.out.println("This is Animal class");
    }
}