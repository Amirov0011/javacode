package projectTest;


public class director extends manager{

    double bonus;


    public director(long id, String name, int workYear, String department, String departmentManaged, double bonus) {
        super(id, name, workYear, department, departmentManaged);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Director is working");
        manege();

    }
    public void mange() {
        System.out.println("Director manages whole company");
        makeStrategicPlan();
    }
    public void makeStrategicPlan(){
        System.out.println("Director makes strategic plan for the company");
    }

    @Override
    public void manege() {
        super.manege();
    }

    @Override
    public double calcSalary() {
       return workYear*BASE_SALARY+MANAGEMENT_PAYMENT+bonus;

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Special bonus: " + bonus);

    }
}
