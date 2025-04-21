class Prime {
    public static void main(String[] ar) {
        int n = 12;

        int c = 0;

        for (int i=2;i<n;i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c > 0) {
            System.out.println("Not Prime Number");
        }
        else {
            System.out.println("Prime Number");
        }
    }
}