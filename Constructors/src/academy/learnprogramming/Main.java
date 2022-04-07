package academy.learnprogramming;

import org.w3c.dom.html.HTMLImageElement;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account(); // ("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(50.00);
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(51.00);
        bobsAccount.withdrawal(100.00);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer leo = new VipCustomer("leo", 500.00, "leo@email.com");
        System.out.println(leo.getName() + " " + leo.getCreditLimit() + " " + leo.getEmailAddress());
    }
}
