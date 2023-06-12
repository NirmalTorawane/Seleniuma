package grooming;

public class MainApp2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setStudentName("Nirmal");
        s1.setSubject(5);
        String name= s1.getStudentName();
        int sub= s1.getSubject();
        System.out.println("Name Of The Student - "+name);
        System.out.println("How Many Subjects - "+sub);
    }
}
