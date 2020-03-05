public class ClassesAndObjects {
  public static void main(String[] args){
    Person person1 = new Person("Vova", 19);
    Person person2 = new Person();
    person2.setAge(10);
    person2.setName("Name");

    System.out.println(person1.getName() + " " + person1.getAge());
    System.out.println(person2.getName() + " " + person2.getAge());

  }
}
class Person{
  // Class can have:
  // 1. Data (fields)
  // 2. Actions (methods)
  private String name;
  private int age;

  String getName(){
    return name;
  }
  int getAge(){
    return age;
  }

  void setName(String name){
    this.name = name;
  }
  void setAge(int age){
    this.age = age;
  }

  Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  Person(){
    this.name = "";
    this.age = 0;
  }
}
class Test2{

}