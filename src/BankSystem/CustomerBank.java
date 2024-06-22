package BankSystem;

import java.util.List;

public class CustomerBank {
    private long id;

    List<Customer> customers;

    List<Bank> bankBranches;

    public CustomerBank(long id, List<Customer> customers, List<Bank> bankBranches) {
        this.id = id;
        this.customers = customers;
        this.bankBranches = bankBranches;
    }
}
