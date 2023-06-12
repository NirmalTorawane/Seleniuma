package grooming;

public class Pattern2 {
    public static void main(String[] args) {
        int n=9;
        int px=n/2+1;
        for (int i=1;i<=n;i++)
        {
            int j;
            for (j=1; j<=n; j++) {
                if (j == px || j == n-px+1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            if (i<=n/2)

                px--;

            else
                px++;
                System.out.println("");


        }
    }
}
