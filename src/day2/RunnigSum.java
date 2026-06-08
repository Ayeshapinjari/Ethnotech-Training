package day2;

import java.util.Arrays;

// ip: 1 2 3 4
// op: 1 3 6 10
// prefix sum : adding previous sum
public class RunnigSum {
   public static void main(String[] args){
       int arr[]={1,2,3,4};
       // Method-1 using var sum
       int sum=0;
       for (int i = 0; i < arr.length; i++) {
           sum+=arr[i]; // sum=0+1, 1+2 ,3+3 , 6+4
           arr[i]=sum;// 0-> 1,1->3, 2->6 , 3-> 10
       }
       System.out.println(Arrays.toString(arr));
       // method -2 adding prev val
       int nums[]={1,2,3,4};
       // we are storing nums of 0 as it is and adding prev element to current
       for (int i = 1; i < nums.length; i++) {
           nums[i]+=nums[i-1];
       }
       System.out.println(Arrays.toString(nums));
   }
}
