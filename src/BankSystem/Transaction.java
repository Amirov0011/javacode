package BankSystem;

import java.util.Date;

public class Transaction {
    private long id;

    private double amount;

    private String description;

    private Date date;

    private BankAccount fromAccount;
    private BankAccount toAccount;

    public Transaction(long id, double amount, String description) {
        this.id = id;
        this.amount = amount;
        this.description = description;

    };

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
