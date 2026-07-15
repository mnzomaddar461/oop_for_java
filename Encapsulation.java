class Atm{
    private int balance = 100000;
    private int cardNumber = 1234;

    void withdrow(int amount){
        balance = balance - amount;
    }
    
    public void display(){
        System.err.println( "User Balance: " + balance);
        System.out.println( "User Card Number: " + cardNumber);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Atm userOne = new Atm();
        userOne.display();
        // userOne.balance = 50000;
        // userOne.cardNumber = 234876;
        // System.out.println("User One: ");
        // userOne.display();
        // Atm userTwo = new Atm();
        // userTwo.balance = 400000;
        // userTwo.cardNumber = 456098;
        // System.out.println("User Two: ");
        // userTwo.display();
    }
}
