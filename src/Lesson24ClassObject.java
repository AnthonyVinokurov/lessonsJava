public class Lesson24ClassObject {
    public static void main(String[] args){
        /*Все классы наследуются от класса Object
        * Все объекты имеют метод toString() от предка Object*/
        String str = "Hello";
        System.out.println(str);


        Human h1 = new Human("bob", 10);

        System.out.println(h1);
    }
}
