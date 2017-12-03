package common;

public class InsufficientFundsException extends Exception {
    private int amount;
    public InsufficientFundsException(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
}
