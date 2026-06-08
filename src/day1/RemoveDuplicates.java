package day1;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[]={1,1,1,1,1};
        for (int i = 0; i < arr.length; i++) {
            boolean b=true;
            for (int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    b=false;
                    break;

                }
            }
            if(b){
                System.out.print(arr[i]);
            }
        }
    }
}
