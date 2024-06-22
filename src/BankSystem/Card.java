package BankSystem;

import java.util.Date;

public class Card {
    private long id;

    private int cardNumber;

    private Date createdAt;

    private Date expiryAt;

    private byte cvv;

    private BankAccount bankAccount;

    public Card(long id, int cardNumber, byte cvv) {
        this.id = id;
        this.cardNumber = cardNumber;

        this.cvv = cvv;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getExpiryAt() {
        return expiryAt;
    }

    public void setExpiryAt(Date expiryAt) {
        this.expiryAt = expiryAt;
    }

    public byte getCvv() {
        return cvv;
    }

    public void setCvv(byte cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", createdAt=" + createdAt +
                ", expiryAt=" + expiryAt +
                ", cvv=" + cvv +
                '}';
    }
}
