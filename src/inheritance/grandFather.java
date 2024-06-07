package inheritance;

public class grandFather {
    String name;

    int age;

    String workName;

    int workYear;



    int houseNumber;

    public static final int  SALARY=1000;

    public grandFather(String name, int age, String workName, int workYear, int houseNumber) {
        this.name = name;
        this.age = age;
        this.workName = workName;
        this.workYear = workYear;
        this.houseNumber = houseNumber;
    }

    public void work(){
        System.out.println("building a house");
    }
    public double calculateSalary(){
        return SALARY*houseNumber;

    }
    public static  int getSalary(){
        return SALARY;

    }
    public void sayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Work Name: "+workName);

    }
}
