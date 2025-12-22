public class Product {
    String name;
    Double price;

    Product(){
        this.name = "Unidentified";
        this.price = 0.0;
    }
    Product(String name){
        this.name = name;
        this.price = 0.0;
    }
    Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){return this.name;};
    public Double getPrice(){return this.price;};

    @Override
    public String toString(){
        return name + " - Цена: " + price;
    }
}
