//Parent class/Super class
class father{
    public void house(){
        System.out.println("I have car bcz i am father");
    }
}
//child class
class son extends father{
    public void car(){
        System.out.println("I have car i am son");
    }
}

public class inheri_oop {
    public static void main(String[] args) {
        son so=new son();
        so.car();
        so.house();

    }
}
