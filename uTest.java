public class uTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Levakov Mat.Anal.",69);
        Item item2 = new Item("Sobolevskaya and Byskavski book",100000);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by oplati
        cart.pay(new OplatiStrategy("minimaledit", "helloWorld123"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Nikolayuk Nikita", "6255252560073537", "228", "02/25"));

        //pay by credit card with wrong cardNumber
        cart.pay(new CreditCardStrategy("Nikolayuk Nikita", "625525256007353", "228", "02/25"));

        //pay by credit card with wrong CVV
        cart.pay(new CreditCardStrategy("Nikolayuk Nikita", "6255252560073537", "1337", "02/25"));

    }

}