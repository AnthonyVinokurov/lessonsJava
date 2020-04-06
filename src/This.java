public class This {
  public static void main(String[] args) {

    Human human2 = new Human("Name", 40);
    Human human3 = new Human("name", 2);
    System.out.println(Human.getDescription());
    Human.printNumberOfPeople();
  }
}

class Human{
  private  String name;
  private int age;
  private static int countPeople;

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
    this.name = name;
    countPeople +=1;
    System.out.println("Hello from third ");
  }

  public String toString(){
    return name +", "+age;
  }

  public static void printNumberOfPeople(){System.out.println("Count of people  = " + countPeople);}
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
