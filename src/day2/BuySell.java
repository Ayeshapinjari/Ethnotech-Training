package day2;

public class BuySell {
    public static void main(String[] args) {
      int arr[]={100,130,260,310,40,535,695};
       // int arr[]={4,2,1};
      int p=0;
      int buy=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(buy>arr[i]){
                p+=arr[i-1]-buy;
                buy=arr[i];
            }
            if(i==arr.length-1){
                p+=arr[i]-buy;
            }
        }
        System.out.println(p);
    }
}
