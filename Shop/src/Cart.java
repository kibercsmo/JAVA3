import java.util.ArrayList;

public class Cart {

    ArrayList<Product> cart = new ArrayList<Product>();
    int sum;

    public void addProduct(Product p){
        cart.add(p);
    }

    public void removeProduct(String name){
        for (Product p: cart){
            if(p.getName().equals(name)){
                cart.remove(p);
                break;
            }
        }
    }

    public void getTotal(){
        sum = 0;
        for(Product p: cart){
            sum += p.getPrice();
        }
        System.out.println("Итого: " + sum);
    }

    public void printCart(){
        sum = 1;
        System.out.println("Ваша корзина:");
        System.out.println("=*=------------------------=*=");
        for(Product p : cart){
            System.out.println(sum + ". " + p);
            sum++;
        }
        System.out.println("=*=------------------------=*=");
    }
}
