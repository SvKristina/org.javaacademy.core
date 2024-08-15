package homework.homework3.shop;

public class Runner {
    public static void main(String[] args) {
        Customer customerPetr = new Customer("Петр");
        Shop shop = new Shop(true, false, 3);
        customerPetr.checkShop(shop);
    }
}
