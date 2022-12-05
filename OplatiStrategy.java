public class OplatiStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public OplatiStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Oplati. Account name is " + this.emailId);
    }


}