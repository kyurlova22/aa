public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Client client1 = new Client();
        bankAccount.attach(client1);

        Client client2 = new Client();
        bankAccount.attach(client2);

        bankAccount.credit(1000.0);
        bankAccount.debit(100);
    }
}
