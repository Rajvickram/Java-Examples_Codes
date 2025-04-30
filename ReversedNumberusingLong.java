import java.util.Scanner;

class ReversedNumberusingLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Reversed Number u need to Reverse : ");
        
        long n = sc.nextLong();

        System.out.println("Enter the Number to store the Dummy value to calculate the value to reversed the Upcoming User Value : ");

        long rev = sc.nextLong();

        while(n!=0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse Number : " + rev);
    }
}