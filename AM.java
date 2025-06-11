class AM {
    private int Id;
    String Name;
    String emailId;
    long mobileNo;
    char Initial;
    private int Age;


    public void Disp() {
        System.out.println("ID : " + Id);
        System.out.println("NAME : " + Name);
        System.out.println("EMAIL_ID : " + emailId);
        System.out.println("MOBILE_NO : " + mobileNo);
        System.out.println("INITIAL : " + Initial);
        System.out.println("AGE : " + Age);
    }

    public void setID(int no) {
        Id = no;
    }

    public void setAGE(int nos) {
        Age = nos;
    }
}


class AM1 {
    public static void main(String[] args) {
        AM sc = new AM();
        sc.setID(180541);
        sc.setAGE(24);
        sc.Name = "Rajvickram";
        sc.emailId = "rajvickram@team.thepenindia.com";
        sc.mobileNo = 7010986623l;
        sc.Initial = 'P';
        sc.Disp();
    }
}