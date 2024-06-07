package projectTest;

public class Main {
    public static void main(String[] args) {
        employee Deyanet= new employee(1,"Deyanet",1,"development");
        System.out.println("Salary:"+ Deyanet.calcSalary());
        Deyanet.printInfo();
        System.out.println("-----------------------");

        manager Camal= new manager(2,"Camal",5,"development",
                "development");
        System.out.println("Salary:"+ Camal.calcSalary());
        Camal.printInfo();
        System.out.println("--------------------");


        director ali=new director(3,"ali",15,"Dev",
                "Whole company",10000);
        System.out.println("Salary:"+ ali.calcSalary());
        ali.printInfo();





    }
}
