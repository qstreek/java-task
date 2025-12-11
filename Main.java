public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Ноутбук", 75000.0);
        Product mouse = new Product("Мышка", 1500.0);
        Product keyboard = new Product("Клавиатура", 3000.0);
        Product headphones = new Product("Наушники", 5000.0);

        Cart cart = new Cart();

        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);
        cart.addProduct(headphones);

        cart.printCart();

        System.out.println("Удаляем: Мышка\n");
        cart.removeProduct("Мышка");

        cart.printCart();

        System.out.println("Удаляем несуществующий товар: Планшет");
        boolean removed = cart.removeProduct("Планшет");
        System.out.println("Товар удален: " + removed + "\n");

        cart.printCart();
    }
}