package inheritance;

public class son extends dad {
    String workSell;
    public static final int Sell_SALARY=100000;

    public son(String name, int age, String workName, int workYear, int houseNumber,
               String workRepairman, String workSell) {
        super(name, age, workName, workYear, houseNumber, workRepairman);
        this.workSell = workSell;
    }



    public son(String name, int age, String workName, int workYear, int houseNumber) {
        super(name, age, workName, workYear, houseNumber);
    }

    @Override
    public void work() {
        son();
    }
    public void son(){
        System.out.println("son is working house building , repairman and sell a house");
    }

    @Override
    public void dad() {
        super.dad();
    }

    @Override
    public double calculateSalary() {
        return SALARY*houseNumber+REPAIR_SALARY+Sell_SALARY;
    }

    @Override
    public void sayInfo() {
        super.sayInfo();
        System.out.println("workSell is :" + workSell);
    }
}





