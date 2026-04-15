import java.util.*;
public class Lec5 {
    public static void main(String args[]) {
        System.out.println("Hello");
        ArrayList<Product> list = new ArrayList<Product>();
        

        //Product p1 = new Product(1, "Mobile", 40000, 200);
        list.add(new Product(1, "Mobile", 40000, 200));
        list.add(new Product(2, "Laptop", 70000, 100));
        list.add(new Product(3, "Tab", 50000, 400));
        list.add(new Product(4, "Watch", 20000, 300));
        list.add(new Product(5, "Buds", 1000, 700));
        System.out.println("Product ID\tProduct Name\tPrice\tQuantity");
        for(Product p : list) {
            //System.out.println()
            String result = String.format("Pid=%s, PName=%s, Price=%fl,and Quantity=%d", p.getPid(),p.getProductName(),
        p.getPrice(), p.getQuantity());
        
        System.out.println(result);
        }
        
        // String result = String.format("Pid=%s, PName=%s, Price=%fl,and Quantity=%d", p1.getPid(),p1.getProductName(),
        // p1.getPrice(), p1.getQuantity());
        
        // System.out.println(result);
    }
}

class Product {    //encapsulation
    private int pid;
    private String productName;
    private double price;
    private int quantity;

    public Product(int pid, String productName, double price, int quantity) {
        super();         //called object class(because all the class are the subclass of object class )
        this.pid = pid;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getProductName() {
        return productName;
    }
    public int getPid() {
        return pid;
    }
}