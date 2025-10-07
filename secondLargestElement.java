package striverQuestions;
import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i= 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int sMax = Integer.MIN_VALUE;
        for(int i : arr){
            if(max<i){
                sMax = max;
                max = i;
            }
            if(max != i && sMax < i){
                sMax = i;
            }
        }
        System.out.println("The Second Largest number in the Array is : " + sMax);
    }
}
