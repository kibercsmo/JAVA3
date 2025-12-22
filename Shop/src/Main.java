import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product ducktape = new Product("Скотч",100.0);
        Product chair = new Product("Стул",1500.0);
        Product screwdriver = new Product("Отвертка",200.0);

        cart.addProduct(ducktape);
        cart.addProduct(ducktape);
        cart.addProduct(chair);
        cart.addProduct(screwdriver);

        cart.printCart();
        cart.getTotal();

        cart.removeProduct("Скотч");

        cart.printCart();
        cart.getTotal();
    }
}