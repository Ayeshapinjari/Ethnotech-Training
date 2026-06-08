package generics.project;

public class Main {
    public static void main(String[] args) {
     Content<String> c =new Content<>();
     c.setName("Ayesha");
     System.out.println(c.getName());
        Content<Integer> c1 =new Content<>();
        c1.setName(123);
        System.out.println(c1.getName());
        Items<String,Double,Boolean> i=new Items<>("Banana",34.56,true);
        System.out.println(i.getName()+" "+i.getD()+" "+i.getB());
    }


}
