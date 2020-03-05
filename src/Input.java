//Все классы пакета java.util импортируются в проект по умолчанию
//Все остальные пакеты нужно импортировать через инструкцию import
import java.util.Scanner;

public class Input {
  public static void main(String [] args){
    int myInt = 0;
    String myStr = new String("Test");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name !");
    myStr = scanner.nextLine();
    System.out.println("You entered \"" + myStr + "\"" + "\n Enter numbers: ");
    try {
      myInt = scanner.nextInt();
    }
    catch (Exception e){
      System.out.println("Mistake is happened " + e);
    }
    System.out.println("You entered: " + myInt);
  }
}
