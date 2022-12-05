public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        if(ccNum.length()==8){
            this.cardNumber=ccNum;
        }else try {
            throw new Exception("The card number was entered incorrectly. Please try again.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if(cvv.length()==3){
            this.cvv=cvv;
        }else try {
            throw new Exception("The card CVV was entered incorrectly. Please try again.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        this.name=nm;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit card. Card number is " + this.cardNumber);
    }

}