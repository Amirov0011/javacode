package BankSystem;

public class Employee {
    private long id;

    private String address;

    private double salary;

    private int phoneNumber;

    private String finCode;

    private Bank bank;


    public Employee(long id, String address, double salary, int phoneNumber, String finCode) {
        this.id = id;
        this.address = address;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.finCode = finCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                ", finCode='" + finCode + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
