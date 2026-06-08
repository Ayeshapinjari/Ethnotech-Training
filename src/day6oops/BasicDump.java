package day6oops;
class Myadd{
    int a;
    int b;
    Myadd(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println(this.a+this.b);
    }
}
public class BasicDump {
    public static void main(String[] args) {
    Myadd obj=new Myadd(10,20);
    obj.display();
    }

}
