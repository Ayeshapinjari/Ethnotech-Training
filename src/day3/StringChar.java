package day3;
import java.util.Scanner;
public class StringChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        int count=0;int max=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
            {
                count++;
            }
            else{
                if(count>max){
                    max=count;
                }
                count=0;
            }
        }
        if(count>max)
        {
            max=count;
        }
        System.out.print(max);
    }
}