class user {
    String name;
    int age;

    user(String a, int b) {
        this.name = a;
        this.age = b;
    }

    void display() {
        System.out.println("The Name of User is \t" + name);
        System.out.println("The Age of User is \t" + age);
    }
}

class department extends user {
    String departmentname;

    department(String a, int b, String c) {
        //take it from base class can send data to base class
        super(a, b);
        this.departmentname = c;
    }
    //method overriding
    void display(){
        System.out.println("The Name of user is \t\t"+name);
        System.out.println("The Age of user is \t\t\t"+age);
        System.out.println("The Department of user is \t"+departmentname);
         System.out.println("********************************************");

    }
}

// method overriding
public class mthod_overriding {
    public static void main(String[] args) {
        department user1=new department("Shathulan", 37, "Software Engineering") ;
        user1.display();
        department user2=new department("Kaneshapillai", 65, "Banking") ;
        user2.display();
    }
}
