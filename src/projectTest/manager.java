package projectTest;

public class manager extends employee{
    String departmentManaged;
    public static final int MANAGEMENT_PAYMENT=5000;

    public manager(long id, String name, int workYear, String department, String departmentManaged) {
        super(id, name, workYear, department);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void work() {
        manege();

    }
    public void manege(){
        System.out.println("Manager manages department "+departmentManaged);
    }

    @Override
    public double calcSalary() {
        return workYear*BASE_SALARY+MANAGEMENT_PAYMENT;

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Department Managed :"+departmentManaged);
    }
}
