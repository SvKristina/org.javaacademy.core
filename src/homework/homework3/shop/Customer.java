package homework.homework3.shop;

public class Customer {
    private final static String SHOP_IS_GOOD =": Магазин прошел проверку!";
    private final static String SHOP_IS_BAD = ": Магазин не прошел проверку!";

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public void checkShop(Shop shop) {
        if ( ( shop.isClearFloor() && (shop.isWorkersHasBadge() || shop.getCountWorkers() >= 2) )
                || ( (shop.isClearFloor() || shop.isWorkersHasBadge()) && shop.getCountWorkers() >= 2 )
                || ( (shop.isClearFloor() || shop.getCountWorkers() >= 2) && shop.isWorkersHasBadge() ) )  {
            System.out.println(name + SHOP_IS_GOOD);

        } else {
            System.out.println(name + SHOP_IS_BAD);
        }
    }
}
