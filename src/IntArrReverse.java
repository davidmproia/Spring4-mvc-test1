import java.util.Arrays;

public class IntArrReverse {
    public static void main(String args[]){
        int[] myArr = {-1,0,1,2,3,4,5};
        System.out.println("\nOriginal Array: " + Arrays.toString(myArr));
        reverseArr(myArr, myArr.length);
        System.out.println("\nReversed Array: " + Arrays.toString(myArr));
    }

    // Method to reverse an array and put elements back into original array
    static void reverseArr(int testArr[], int s){
        // variables defined 1st
        int a, c, i;

        // Used to print out original array before reversing
        for (i = 0; i < testArr.length; i++) {
            System.out.print(testArr[i] + ", ");
        }
        System.out.println("\n");

        // Part 1; test original loop against known java.utils.arrays
        System.out.println(" 2nd item in array is index at testArr[1]:: " + testArr[0]);
        System.out.println(" 2nd item in array is index at testArr[1]:: " + testArr[1]);
        System.out.println(" 2nd to last item in array is index at testArr[s-2]: " + testArr[s-2]);
        System.out.println(" Last item in array is index at testArr[s-1]: " + testArr[s-1]);
        System.out.println("\n");

        // part 2 ; create loops to reverse the elements
        for ( a = 0; a < s / 2; a++ ){
            c=testArr[a];
            testArr[a]=testArr[s - a - 1];
            testArr[s - a - 1] = c;
        }
        // part 3 ; check reversed loop against known java.utils.arrays
        System.out.println(" 1st item in array is index at testArr[0]:: " + testArr[0]); // Part 1;
        System.out.println(" 2nd item in array is index at testArr[1]:: " + testArr[1]); // Part 1;
        System.out.println(" 2nd to last item in array is index at testArr[s-2]: " + testArr[s-2]); // Part 1;
        System.out.println(" Last item in array is index at testArr[s-1]: " + testArr[s-1]); // Part 1;
        for (int b = 0; b < s; b++){
                System.out.print(testArr[b] + ", ");
        }
        System.out.println("\n");

    }
}
