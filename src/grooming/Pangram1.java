package grooming;

import java.util.Scanner;

public class Pangram1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num;
        int rev=0, rem;
        while (temp!=0)
        {
            rem=temp%10;
            rev=rev*10+10;
            temp=temp/10;
        }
        if (num==rev)
        {
            System.out.println(num+"is palindrome number");

        }else {
            System.out.println(num+"is not palindrom number");
        }

    }
}
