/*
  *
  * Fruit Shop
  *
  * Available all the fruits
 */

package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args){
        final ArrayList<Product> cart = new ArrayList<>();

        final Scanner scanner = new Scanner(System.in);

        final ArrayList<Product> carts = new ArrayList<>();

        carts.add(new Product("Apple",20));
        carts.add(new Product("Orange",30));
        carts.add(new Product("Grapes",50));
        carts.add(new Product("Banana",10));
        carts.add(new Product("Strawberry",100));
        carts.add(new Product("Watermelon",110));
        carts.add(new Product("Mango",45));
        carts.add(new Product("PineApple",60));

        System.out.println("Available Fruit list");
        for(Product product: carts){
            System.out.println(product.getName()+"Price is:"+product.getPrice());
        }

        double totalPrice = 0.0;

        while (true) {
            System.out.println("Enter your buying fruit name");
            String fruitname = scanner.nextLine();

            if (fruitname.equalsIgnoreCase("done")) {
                break;
            }

            Product selectedProduct = null;

            for (Product product : carts) {
                if (product.getName().equalsIgnoreCase(fruitname)) {
                    selectedProduct = product;

                    break;
                }
            }
            if (selectedProduct != null) {

                cart.add(selectedProduct);
                System.out.println(selectedProduct.getName() + " added to cart.");
                totalPrice += selectedProduct.getPrice();

                System.out.println("Your Total amount is: " + totalPrice);

            } else {
                System.out.println("Product is currently Unavailable");
            }
        }
    }
}
class Product{
    private String name;
    private double price;

    public Product(final String name, final double price) {
        this.name = name;
        this.price = price;
    }

    public final String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public final double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }
}
