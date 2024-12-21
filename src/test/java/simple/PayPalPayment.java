package simple;

public class PayPalPayment implements Payment{
	public void makePayment() {
        System.out.println("Payment made using PayPal.");
    }
	public void makeCred() {
        System.out.println(" Credit");
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 PayPalPayment p = new  PayPalPayment ();
		 p.makePayment();

	}

}
