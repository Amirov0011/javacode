package inheritance;

public class dad extends grandFather{
    String workRepairman;
    public static final  int REPAIR_SALARY=2000;


    public dad(String name, int age, String workName, int workYear, int houseNumber, String workRepairman) {
        super(name, age, workName, workYear, houseNumber);
        this.workRepairman = workRepairman;
    }

    public dad(String name, int age, String workName, int workYear, int houseNumber) {
        super(name, age, workName, workYear, houseNumber);
    }

    @Override
    public void work() {
        dad();
    }
    public void dad() {
        System.out.println("dad is work house building and repairman");
    }

    @Override
    public double calculateSalary() {
        return SALARY*houseNumber+REPAIR_SALARY;
    }

    @Override
    public void sayInfo() {
        super.sayInfo();
        System.out.println("workRepairman: " + workRepairman);
    }
}


