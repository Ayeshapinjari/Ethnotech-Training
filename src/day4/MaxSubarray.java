package day4;
//Find maximum sum of any subarray of size K.
// fixed size sliding window
public class MaxSubarray {
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3,2};
        int k=3;
        //method-1
//        int winsum=0;
//        for (int i = 0; i < k; i++) {
//            winsum+=arr[i];
//        }
//        int max=winsum;
//        for (int i = k; i < arr.length ; i++) {
//            winsum=winsum-arr[i-k]+arr[i];
//            max=Math.max(winsum,max);
//        }
        //METHOD -2
        int sum = 0;
        int max = 0;
    int l=0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(i >= k-1){
                max = Math.max(max, sum);
                sum-=arr[l];
                l++;
            }
        }
        System.out.println(max);
    }
}
