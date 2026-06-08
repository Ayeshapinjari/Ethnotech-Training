package day2;

import java.util.Arrays;
public class RemoveElement {
    public static void main(String args[]){
        System.out.println(Arrays.toString(remove(new int[]{10,6,0,18,11,7,24,0,5},11)));
    }
    public static int[] remove(int[] arr,int key){
        int in=-1;
        for (int i = 0; i < arr.length; i++) {
            if(key==arr[i]){
                in=i;
                break;
            }
        }
        for (int i = in+1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        // arrays.copyrange is used to create a new array from given range like 0 t0 n
        return Arrays.copyOfRange(arr,0,arr.length-1);
    }
}
