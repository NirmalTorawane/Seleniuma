package grooming;

public class Main5 {
    public static void main(String[] args) {
        String s1="SachinTendulkar";
        String s2="Tendulkar";
        s2=s1.substring(s1.length()-s2.length());
        System.out.println(s2);
        s1=s1.substring(s2.length());
        System.out.println(s1);
    }
}
