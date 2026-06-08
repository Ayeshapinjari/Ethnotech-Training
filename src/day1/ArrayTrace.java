package day1;

import java.util.Arrays;
    class ArraysTrace{
        public static void main(String[] args){
            int arr[]={1,2,3,4,5};
            for (int i = 0; i < arr.length-1; i++) {
                arr[i+1]=arr[i];
            }
            System.out.println(Arrays.toString(arr));
        }
    }

