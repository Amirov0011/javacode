package inheritance;

import java.sql.SQLOutput;

public class MAin {
    public static void main(String[] args) {
        grandFather ali=new grandFather("ali",63,"house builder",25,1);
        System.out.println("Salary: "+ali.calculateSalary());
        ali.sayInfo();
        System.out.println("---------------------------");


        dad vali = new dad("vali",45,"repairman",20,3,"repairman");
        System.out.println("Salary: "+vali.calculateSalary());
        vali.sayInfo();
        System.out.println("------------------");


        son murad = new son("murad",25,"sell house",5,5
                ,"repairman","sell house" );
        System.out.println("Salary: "+murad.calculateSalary());
        murad.sayInfo();
        System.out.println("hello");

    }
}
