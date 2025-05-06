class Methods {

    //  1st Step :-

    public static void main(String[] args) {
        // Method Calling :-
        add();
    }


    // Methods Definition :-
    public static void add() {
        int a = 12;
        int b = 15;
        int c = a+b;
        System.out.println("Added : " + c);
    }
}



// 2nd Step :- (Parameterized Function with Void intilization)

// class Methods {
//     public static void main(String[] args) {
//         add(10,20);
//     }

//     public static void add(int a,int b) {
//         int c = a + b;
//         System.out.println("C : " + c);
//     }
// }



//  3rd Step :-  (Parameterized Function with Non Void initialization)

// class Methods {
//     public static void main(String[] args) {
//         int res = add(12,87);
        //    res = res * 10;
        //    System.out.println("Added : " + res);
//     }

//     public static int add(int a,int b) {
//         int c = a + b;
//         return c;
//     }
// }