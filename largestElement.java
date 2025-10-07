package striverQuestions;
import java.util.Scanner;
public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i= 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i : arr){
            if(max<i)
                max = i;
        }
        System.out.println("The Max number in the Array is : " + max);
    }
}
