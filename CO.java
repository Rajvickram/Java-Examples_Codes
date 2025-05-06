class CO {
    int age;
    String name;
    long phoneNumber;
    char initial;

    public void disp() {
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
        System.out.println("PhoneNumber : " + phoneNumber);
        System.out.println("Initial : " + initial);
    }

    public static void main(String[] args) {
        CO sc = new CO();
        sc.age = 24;
        sc.name = "Rajvickram";
        sc.phoneNumber = 7010986623l;
        sc.initial = 'P';
        sc.disp();
    }
}