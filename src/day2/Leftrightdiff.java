package day2;

import java.util.*;

public class Leftrightdiff {
    public static void main(String args[]){
        // method -1
        // time o(n) space o(n)
        int nums[]={10,4,8,3};
        int n=nums.length;
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int ans[]=new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            left[i]=left[i-1]+nums[i-1];
        }
        for (int i =n-2 ; i >=0 ; i--) {
            right[i]=right[i+1]+nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            ans[i]=Math.abs(left[i]-right[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}
