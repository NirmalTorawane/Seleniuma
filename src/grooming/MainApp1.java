package grooming;

public class MainApp1 {
    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        e1.setEmpId(120);
        e1.getEmpSalary(50000);
        int id= e1.getEmpId();
        double salary= e1.getEmpSalary();
        System.out.println("EMPID"+id);
        System.out.println("EMPSALARY"+salary);
    }
}
