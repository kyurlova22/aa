public class Client implements Observer {

    @Override
    public void update(Subject subject) {
        double amount = ((BankAccount) subject).getAmount();
        System.out.println("Bank account value = " + amount);
    }
}
