package BankSystem;

import java.util.Date;
import java.util.List;

public class BankAccount {
    private long id;

    private boolean accountType;

    private double balance;

    private Date openingAt;

    List<Loans> loans;

    List<Transaction> transactions;

    public BankAccount(long id,  double balance ) {
        this.id = id;

        this.balance = balance;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAccountType() {
        return accountType;
    }

    public void setAccountType(boolean accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getOpeningAt() {
        return openingAt;
    }

    public void setOpeningAt(Date openingAt) {
        this.openingAt = openingAt;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountType=" + accountType +
                ", balance=" + balance +
                ", openingAt=" + openingAt +
                '}';
    }
}
