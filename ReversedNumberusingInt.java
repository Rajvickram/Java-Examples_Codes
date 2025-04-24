class ReversedNumberusingInt {
    public static void main(String[] args) {
        int n = 123456789;
        int rev = 0;

        // While using this Reversed Number with the help of (Integer) => int;

        while(n!=0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Reversed Number : " + rev);
    }
}