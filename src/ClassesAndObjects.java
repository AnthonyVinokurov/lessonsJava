public class ClassesAndObjects {
  public static void main(String[] args){
    Person person1 = new Person("", 10);
    Person person2 = new Person();
    person2.setAge(0);
    person2.setName("");

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

  String getName(){return name;}

  int getAge(){return age;}

  void setName(String name){
    if(name.isEmpty()) {
      System.out.println("You entered empty name");
    }else {
      this.name = name;
    }
  }

  void setAge(int age){
    if(age <= 0){
      System.out.println("You entered incorrect age ");
    }else {
      this.age = age;
    }
  }

  Person(String name, int age){
    this.setName(name);
    this.setAge(age);
  }

  Person(){
    this.setName("name");
    this.setAge(1);
  }
}
class Test2{

}