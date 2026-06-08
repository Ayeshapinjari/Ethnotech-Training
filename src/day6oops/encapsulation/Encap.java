package day6oops.encapsulation;
// DAY - 7
 class AccessModify{
    private int a=10;// within the class , can be accessed trough getters and setters
    public int b=20;// access in all
    int d=30;// accessed only with in package
     protected int c=40;// accesed with in packageand sub package
     public int getA() {
         return a;
     }
     public void setA(int a) {
         this.a = a;
     }
 }
class Access1 extends AccessModify{
     void print(){
         System.out.println(getA());
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
     }
}
public class Encap {
    public static void main(String[] args) {
        Access1 obj=new Access1();
        obj.print();
    }
}
