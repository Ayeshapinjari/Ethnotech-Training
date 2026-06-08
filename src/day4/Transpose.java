package day4;
// 1. transpose matrix
// 2, rev each row
public class Transpose {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n=arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                int temp=arr[j][i];
               arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int l=0;
            int r=arr.length-1;
          while(l<r){
              int temp=arr[i][l];
              arr[i][l]=arr[i][r];
              arr[i][r]=temp;
              l++;
              r--;
          }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
