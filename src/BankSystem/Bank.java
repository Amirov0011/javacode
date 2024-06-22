package BankSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private  long id;

    private  String name;

    List<BankBranch>bankBranch;

    List<Employee>employees;

    public Bank(long id, String name) {
        this.id = id;
        this.name = name;
        this.bankBranch = new ArrayList<BankBranch>();
        this.employees=new ArrayList<Employee>();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
