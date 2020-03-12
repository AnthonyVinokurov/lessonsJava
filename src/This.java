public class This {
  public static void main(String[] args) {
    Human human1 = new Human();
    Human human2 = new Human("Name");
    Human human3 = new Human("name", 2);
    System.out.println(Human.getDescription());
  }
}

class Human{
  String name;
  int age;
  public static String description = "Nice";

  public Human(){
    System.out.println("Hello from first ");
  }
  public Human(String name){
    this.name = name;
    System.out.println("Hello from second ");
  }
  public Human(String name, int age){
    this.age = age;
    System.out.println("Hello from third ");
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }

  public static String getDescription(){
    return description;
  }

  public void getInfo(){
    System.out.println("");
  }
}
