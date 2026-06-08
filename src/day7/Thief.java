package day7;

import java.util.ArrayList;
import java.util.Arrays;

// [5,4,3,8,5,1,0,2,8]
// there is a thief and array values are gold in each room
// there r 3 rounds first he visits all 2nd round he will visit even rooms next he visit odd rooms
public class Thief {
    public static void main(String[] args) {
        int arr[]={5,4,3,8,5,1,0,2,8};
        int arr1[]=new int[arr.length*2];
        int e=arr.length;
        int o=e+arr1.length/2;
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
            if((i+1)%2==0){
                arr1[e++]=arr[i];
            }
            else{
                arr1[o++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
