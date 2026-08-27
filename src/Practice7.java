public class Practice7 {
    public static void main(String[] args) {
        Product product1 = new Product("PlayStation 5",649);
        Product product2 = new Product("Iphone 17 pro max",1199);
        Product product3 = new Product("Lenovo Loq 16",1099);
        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.removeProduct(product1);
        product2.showProductInfo();
        cart.showBasket();
    }
}
class Product {
    String product;
    int value;
    Product(String product, int value) {
        this.product = product;
        this.value = value;
    }
    void showProductInfo() {
        System.out.println("Информация о продукте: ");
        System.out.println("Продукт: "+ product);
        System.out.println("Цена: " + value);
        System.out.println("------------------------------------");
    }
}
class Cart {
    int basket = 0;
    void showBasket() {
        System.out.println("Стоимость корзины: " + basket + "$");
        System.out.println("------------------------------------");
    }
    void removeProduct(Product product) {
        basket = basket - product.value;
        System.out.println(product.product + " удалён из корзины");
        System.out.println("------------------------------------");
    }
    void addProduct(Product product) {
        basket = basket + product.value;
        System.out.println(product.product + " добавлен в корзину");
        System.out.println("------------------------------------");
    }
}