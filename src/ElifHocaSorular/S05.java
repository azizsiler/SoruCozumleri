package ElifHocaSorular;

import java.util.Arrays;
import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        /*
     verilen bir int dizisi icin elemanlarin karelerini bulun

         */

       int arr[]={2,6,4,5,8,9};

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]*arr[i];

        }
        System.out.println("elemanalrin karasi"+ Arrays.toString(arr));
    }
}
