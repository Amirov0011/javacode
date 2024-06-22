package BankSystem;

import extend.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank kapital=new Bank(1223456,"Kapital");
        Bank unibank=new Bank(78894556,"Unibank");
        Bank abb=new Bank(75694556,"ABB");


        Customer ali=new Customer(125896,"Ali","Baki seheri","0508754","ali@gmail.com");
        Customer vali=new Customer(1245,"Vali","Baki seheri","0508764","vali@gmail.com");
        Customer seid=new Customer(4585,"Seid","baki seheri","050258","seid@gmail.com");

        List<Bank> bank=new ArrayList<Bank>();
        bank.add(kapital);
        bank.add(unibank);
        bank.add(abb);

        List<Customer>customers=new ArrayList<>();
        customers.add(ali);
        customers.add(vali);
        customers.add(seid);

        Employee employee=new Employee(57,"Baku",800,050,"7q44a");
        Employee employee1=new Employee(12,"baku",850,055,"4d5s1");
        Employee employee2=new Employee(52,"baku",950,051,"4d5s2");

        Card card=new Card(58L,4169, (byte) 555);
        Card card1=new Card(1245L,4170, (byte) 585);
        Card card2=new Card(1145L,4180, (byte) 545);

        BankAccount bankAccount=new BankAccount(125,5000.23);
        BankAccount bankAccount1=new BankAccount(155,2000.23);
        BankAccount bankAccount2=new BankAccount(250,9000.23);

        Transaction transaction=new Transaction(531,500,"500 azn gonderildi");

        CustomerBank customerBank=new CustomerBank(45,customers,bank);









    }
}
