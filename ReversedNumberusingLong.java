import java.util.Scanner;

class ReversedNumberusingLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Reveresed Number u Want to Reverese : ");

        long n = sc.nextLong();

        System.out.println("Enter the Variable Name to store the Dummy Value to get Reverese Number series to Increment and to Get the Reverse Series : ");

        long rev = sc.nextLong();


        while(n!=0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Reversed Number : " + rev);
    }
}