//DAY 5 DAY 6
package day5.HungerBox;
import java.util.ArrayList;
interface Oderable{
    double getPrice();
    String getDescription();
    void prepare();
}
interface Discounts{
    double applyDiscounts(double discount);
}
abstract class MenuItems implements Oderable,Discounts{
    private final String name;
    private double price;
    private static int totalOrders=0;
    String categories;
    public MenuItems(String name,double price,String categories){
        this.name=name;
        this.price=price;
        this.categories=categories;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }
    }
    public static int getTotalOrders() {
        return totalOrders;
    }

    public static void setTotalOrders(int totalOrders) {
        MenuItems.totalOrders = totalOrders;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
    @Override
    public String getDescription() {
        return "Item Name : "+getName()+" Price : $"+getPrice() ;
    }
   @Override
    abstract public void prepare();

    @Override
    public double applyDiscounts(double discount) {
        return price -(price*discount/100);
    }
}
class VegItems extends MenuItems{
    private boolean isJain;
    public VegItems(String name, double price) {
        super(name, price, "veg");
        isJain = false;
    }
    public VegItems(String name, double price,  boolean isJain) {
        super(name, price, "veg");
        this.isJain = isJain;
    }

    @Override
    public void prepare() {
        System.out.println("Your Order Of "+ getName()+" of Price "+getPrice()+" Is Been Prepared");
        setTotalOrders(getTotalOrders()+1);
    }
}
class NonVegItems extends MenuItems{
    private String meatType;

    public NonVegItems(String name, double price, String categories, String meatType) {
        super(name, price, categories);
        this.meatType = meatType;
    }
    @Override
    public void prepare() {
        System.out.println("Your Order Of "+ getName()+" of Price "+getPrice()+" Is Been Prepared");
        setTotalOrders(getTotalOrders()+1);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +this.meatType;
    }
}
class Orders{
    private final int orderId;
    private static int ordercount=0;
    private final String customerName;
    ArrayList<MenuItems> list;
    private String status;
    public Orders(String customerName) {
        this.customerName = customerName;
        this.list=new ArrayList<>();
        this.status="Order Placed";
        this.orderId=++ordercount;
    }
    public void addItems(MenuItems items){
        list.add(items);
        System.out.println("The items Orders is "+items.getName()+" The Price is "+items.getPrice());
    }
    public void prepareOrder(){
        this.status="preparing order";
        for(MenuItems items:list){
            items.prepare();
        }
    this.status="Ready";
    }
    public double calculatePrice(){
        double price=0;
        for(MenuItems items:list){
            price+=items.getPrice();
        }
        return price;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void generateBill(double discountPercent){
        double subtotal = calculatePrice();
        double discounted = subtotal - (subtotal * discountPercent / 100);
        double tax  = discounted * 0.05;
        double total = discounted + tax;

        System.out.println("  ┌────────────────────────────────────┐");
        System.out.println("  │         HungerBox — Bill           │");
        System.out.println("  ├────────────────────────────────────┤");
        System.out.println("  │  Order ID  : #" + orderId);
        System.out.println("  │  Customer  : " + customerName);
        System.out.println("  │  Status    : " + status);
        System.out.println("  ├────────────────────────────────────┤");
        for (MenuItems item : list) {
            System.out.printf("  │  %-22s ₹%6.2f%n", item.getName(), item.getPrice());
        }
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  Subtotal              ₹%8.2f%n", subtotal);
        if (discountPercent > 0)
            System.out.printf("  │  Discount (%d%%)         -₹%7.2f%n", (int)discountPercent, subtotal - discounted);
        System.out.printf("  │  GST (5%%)              ₹%8.2f%n", tax);
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  TOTAL                 ₹%8.2f%n", total);
        System.out.println("  └────────────────────────────────────┘");

    }
}
class Res {
    private String name;
    ArrayList<MenuItems> menu;
    ArrayList<Orders> orders;

    public Res(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    void addMenu(MenuItems items) {
        menu.add(items);
    }

    void showMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + " : " + menu.get(i).getDescription());
        }
    }

    Orders placeOrder(String name) {
        Orders order1 = new Orders(name);
        orders.add(order1);
        return order1;
    }

    MenuItems getItem(int index) {
        return menu.get(index);
    }

    void showOrder(){
        for(Orders order : orders){
            System.out.println("The order of "+order.getCustomerName()+" "+order.getStatus()+menu.get(order.getOrderId()).getDescription());
        }
    }
}
public class HungerBox {
public static void main(String[] args) {
    System.out.println("                    WELCOME TO HUNGER BOX       ");
    Res res=new Res("Spicy Garden");
    res.addMenu(new VegItems("paneer butter masala",300));
    res.addMenu(new VegItems("soya butter masala",200));
    res.addMenu(new VegItems("tofu butter masala",250));
    res.addMenu(new VegItems("paneer butter masala",150));
    res.addMenu(new VegItems("peanut butter masala",300,true));
    res.addMenu(new NonVegItems("chicken butter masala",350,"Non Veg","chicken"));
    res.showMenu();
    Orders ord=res.placeOrder("Ayesha P");
    ord.addItems(res.getItem(0));
    ord.addItems(res.getItem(1));
    ord.addItems(res.getItem(5));
    res.showOrder();
    ord.prepareOrder();
    ord.generateBill(100);

}
}
