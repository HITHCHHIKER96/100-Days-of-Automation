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
    int[][] arr1 = {
        {1, 2, 3}, // assume this ia an array of index 0,
        {2, 5, 7} // this is an array of index 2.
    }; // It is basically an arrays of arrays.
    like if you want to access 5 from arr1[][] : arr[1][1] = 5 this is how you can access.
    Note: At first i told that row is mandatory why? assume an array like this:
    arr2[][] = {
        {12, 14, 18},
        {10, 11},
        {9, 5, 3, 1}
    }; // here row no is mandatory and should be fixed but coloumn cannot be as every row is an object of arr2.

    // how to take input:
    
}
