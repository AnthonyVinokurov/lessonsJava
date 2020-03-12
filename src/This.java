public class This {
  public static void main(String[] args) {
    Human human = new Human();
  }
}

class Human{
  String name;
  int age;

  public Human(){

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

  public void getInfo(){
    System.out.println("");
  }
}
