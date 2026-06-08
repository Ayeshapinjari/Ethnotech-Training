package day2;

public class BuySellStock {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int p=0;
        int buy=arr[0];
        for(int i=1;i<arr.length-1;i++){

                buy=Math.min(arr[i],buy);

            if(arr[i]>buy){
                p+=arr[i]-buy;
                buy=arr[i+1];
            }
        }
        System.out.println(p);

    }
}
