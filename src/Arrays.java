/*
* Array is reference data type.
*/
public class Arrays {
  public static void main(String [] args){
    //Int array initialized as 0 by default
    int[] numbers = new int[5];  //numbers -> [array]
    for (int i = 0; i<numbers.length; i++){
      numbers[i] = i;
      System.out.println(numbers[i]);
    }
    System.out.println("\n");
    int[] numbers1 = {1,2,3,4,5,6,7};
    for (int i = 0; i<numbers1.length; i++){
      System.out.println(numbers1[i]);
    }
  }
}
