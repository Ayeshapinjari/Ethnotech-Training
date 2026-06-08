package day4;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        System.out.println(arr.length);
//        System.out.println(Arrays.deepToString(arr));// tostring give references deeptostring go to address and fetch elements
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j]=sc.nextInt();
//            }
//        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            sum+=arr[i][j];
            }
        }
        // row wise sum
        for (int i = 0; i < arr.length; i++) {
            int row_sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                row_sum+=arr[i][j];
            }
            System.out.print(row_sum+" ");
        }
        System.out.println();
        // column wise sum
        for (int i = 0; i < arr.length; i++) {
            int col_sum=0;
            for (int j = 0; j < arr[i].length; j++) {
               col_sum+=arr[j][i];
            }
            System.out.print(col_sum+" ");
        }
        System.out.println();
        //diagonal elements
        for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][i]+" ");
            }
        //secondary diagonal
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length-1-i]+" ");
        }


        System.out.println(Arrays.deepToString(arr));
        System.out.println(sum);





    }
}
