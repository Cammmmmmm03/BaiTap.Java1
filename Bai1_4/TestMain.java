package Bai1_4;

public class TestMain{
    public static void main(String[] args) {
        Employee e1= new Employee(03, "phan", "cam", 100);
        System.out.println(e1);
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is:"+e1.getId());
        System.out.println(" firstName is:"+ e1.getFirstName());
        System.out.println(" lastName is :"+ e1.getLastName());
        System.out.println("salary is :"+ e1.getSalary());
        System.out.println("name is:"+ e1.getName());
        System.out.println(" annualSalary is:"+ e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(10) );
        System.out.println(e1);
    }
}
