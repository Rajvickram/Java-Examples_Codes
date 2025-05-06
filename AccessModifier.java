class AccessModifier {
    private int id;
    private String Name;
    private int age;
    char Initial;


    public void disp() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + Name);
        System.out.println("Age : " + age);
        System.out.println("Initial : " + Initial);
    }

    public void setId(int num) {
        id = num;
    }

    public void setFull(String full) {
        Name = full;
    }

    public void setAg(int a) {
        age = a;
    }
}


class Acc {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.setId(41);
        obj.setFull("Rajvickram");
        obj.setAg(24);
        obj.Initial = 'P';
        obj.disp();
    }
}