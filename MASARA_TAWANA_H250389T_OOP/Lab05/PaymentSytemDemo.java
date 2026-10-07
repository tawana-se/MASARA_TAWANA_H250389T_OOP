package Lab05;

class Payment {
    void processPayment(double amount) {
        System.out.println("Processing general payment of $" + amount);
    }
}

class CardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Card Payment of $" + amount + " with encrypted vendor authorization tokens.");
    }
}

class MobileMoneyPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Mobile Money Payment of $" + amount + " via SMS authentication gateway.");
    }
}

public class PaymentSytemDemo {
    public static void main(String[] args) {
        Payment p1 = new CardPayment();
        Payment p2 = new MobileMoneyPayment();
        
        p1.processPayment(150.00);
        p2.processPayment(45.50);
    }
}