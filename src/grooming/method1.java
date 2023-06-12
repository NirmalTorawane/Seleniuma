package grooming;

public class method1 {
    public static void main(String[] args) {
        System.out.println("MAIN METHOD");
        createAccount();

    }
    static void createAccount()
    {
        System.out.println("ACCOUNT CREATED");
        createProfile();

    }
    static void createProfile()
    {
        System.out.println("PROFILE CREATED");
    }
}
