import java.util.Arrays;

public class IntArrForward {
    public static void main(String args[]){
        int[] myTests = {3,2,5,10,-8};
        System.out.println("\n Using java.utils.arrays should match the above: " + Arrays.toString(myTests));
        int_ArrFroward(myTests);
    }

    public static void int_ArrFroward(int[] test) {
        System.out.println("\n Using a created method int_ArrForward Array(): ");
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + ", ");
        }
        System.out.println("\n");
    }
}
