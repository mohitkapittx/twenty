package simple;

public class CreditCardPayment implements Payment {
	public void makePayment() {
        System.out.println("Payment made using Credit Card.");
      
    }
	public void makeCred() {
        System.out.println(" Credit Card.");
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCardPayment c = new CreditCardPayment();
		c.makePayment();
	}

}
