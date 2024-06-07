package projectTest;

public class employee {
    long id;


    String name;


    int workYear;

    String department;


    public static final int BASE_SALARY = 500;

    public employee(long id, String name, int workYear, String department) {
        this.id = id;
        this.name =name;
        this.workYear = workYear;
        this.department = department;
    }
    public void work(){
        System.out.println("Employee is working");
    }
    public double calcSalary(){
        return workYear*BASE_SALARY;


    }
    public static int getBaseSalary(){
        return BASE_SALARY;

    }
    public void printInfo(){
        System.out.println("no:"+ id);
        System.out.println("name:"+ name);
        System.out.println("workYear:"+ workYear);
        System.out.println("department:"+ department);

    }


}
