package day7;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int arr[]={2,-5,1,7,-3,4,-6};
        // n^2 complexity
        int max=Integer.MIN_VALUE;
        int curr=0;

//        for (int i = 0; i < arr.length; i++) {
//            int sum=0;
//            for (int j = i; j < arr.length; j++) {
//                sum+=arr[j];
//                max=Math.max(sum,max);
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            curr+=arr[i];
            if(curr>max){
                max=curr;
            }
            else if(curr<0){
                curr=0;
            }
        }
        System.out.println(max);
    }
}
