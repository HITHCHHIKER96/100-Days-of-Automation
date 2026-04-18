import java.util.Arrays;
import java.util.Scanner;

public class Input {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // Arrays of Primitives: 
      int[] arr1 = new int[5];
      /* for(int i=0;i<arr1.length;i++){
        arr[i] = sc.nextInt();
      } */
    //using for each/ advanced for loop:
    for(int num = arr1){
      System.out.print(num + " "); // here num represents the elemenst in the array...
      // one more simple ways to print
      System.out.println(Arrays.toString(arr1)); // Array has toString method when you give it an array it convert it into a String.

      // Arrays of Objects:
      String[] str = new String[5];

      for(int i = 0; i< str.length;i++){
        str[i] = sc.next();
      }
      System.out.print(Arrays.toString(str));  
      
  }
}
  
