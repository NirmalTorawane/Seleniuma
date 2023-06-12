package grooming;

public class Swipping {
    public static void main(String[] args) {

          int x=10;
          int y=20;

        System.out.println("BEFORE SWAPPING x="+x+"y="+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("AFTER SWAPPING x="+x+"y="+y);

    }
}
