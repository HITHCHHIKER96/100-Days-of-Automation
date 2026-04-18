import java.util.*;

public class Myclass {
    public static void main(String[] args){
        // System.out.println("Hello");
        int[] arr = {23, 6, 87, 10};
        System.out.println(Arrays.toString(arr));
        changeMe(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeMe(int[] arr){
        arr[0] = 3;
    }   /// That is why arrays are mutable in Java as you can chnage it after is created.

    // Now lets see 2D Arrays:
    int[][] arr = new int[][]; // so here is [][] defined by 2d arrays and most important is when the initialisation part happened first [] is for row and second [] is for coloumn and the first one size you have to define as it is mandatory, but the second one is not mandatory.
    like int[][] arr1 = new in[2][]; // you can left the size blank for coloumn but for row you have to define it.
}
