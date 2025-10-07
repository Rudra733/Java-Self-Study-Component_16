package striverQuestions;
import java.util.Scanner;
public class arraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;  //assuming that the array is Sorted
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if(!isSorted){
            System.out.println("Array is not Sorted");
        }
        else{
            System.out.println("Array is Sorted");
        }
    }
}
