package day3;

public class Op {
public static void main(String[] args) {
    System.out.println(binary_operation("1C0C1C1A0B1"));
}
public static int binary_operation(String str){

 if(str.isEmpty()){
     return -1;
 }
    int res=str.charAt(0)-'0';
    for (int i = 0; i < str.length()-1; i+=2) {
        char ch=str.charAt(i);
        int val=str.charAt(i+1);
        if(ch=='C'){
            res^=val;
        }
        else if(ch=='A'){
            res&=val;
        }
        else if(ch=='B') {
            res |= val;
        }
    }
 return res;
}
}
