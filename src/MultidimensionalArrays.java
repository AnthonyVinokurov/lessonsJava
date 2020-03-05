public class MultidimensionalArrays {
  public static void main(String[] args){
    int[] numbers = new int[] {1,2,3};
    int[][] matrix = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
    System.out.println(matrix[2][2]);
    for (int[] i:matrix){
      for(int j:i){
        System.out.print(j+"\t");
      }
      System.out.println();
    }
  }
}
