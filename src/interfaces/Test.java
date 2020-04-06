package interfaces;

public class Test {
    public static void main(String[] args) {
        Info one = new Animal(1);
        Info two = new Person("Bob");

        outputInfo(one);
        outputInfo(two);

        one.showInfo();
        two.showInfo();

        Animal animal = new Animal(1);
        Person person = new Person("Petuh");
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
