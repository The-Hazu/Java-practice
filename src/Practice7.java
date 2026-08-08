public class Practice7 {
    public static void main(String[] args) {
        Magazine product1 = new Magazine("PlayStation 5",649);
        Magazine product2 = new Magazine("Iphone 17 pro max",1199);
        Magazine product3 = new Magazine("Lenovo Loq 16",1099);
        Card card = new Card();
        card.addProduct(product1);
        card.addProduct(product2);
        card.addProduct(product3);
        card.removeProduct(product1);
        product2.showProductInfo();
        card.showBasket();
    }
}
class Magazine {
    String product;
    int value;
    Magazine(String product, int value) {
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
class Card {
    int basket = 0;
    void showBasket() {
        System.out.println("Стоимость корзины: " + basket + "$");
        System.out.println("------------------------------------");
    }
    void removeProduct(Magazine product) {
        basket = basket - product.value;
        System.out.println(product.product + " удалён из корзины");
        System.out.println("------------------------------------");
    }
    void addProduct(Magazine product) {
        basket = basket + product.value;
        System.out.println(product.product + " добавлен в корзину");
        System.out.println("------------------------------------");
    }
}