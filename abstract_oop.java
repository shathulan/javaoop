abstract class mobile{
    void callfun(){
        System.out.println("All Mobile have call enable function");

    }
    //abstract method declaration only
    abstract void camera();
    abstract void display();
}

class nokia extends mobile{
    void display(){
        System.out.println("We have 5.5 inch display");
    }
    //make body for the abstract method 
    void camera(){
        System.out.println("I have 32 px Camera");
    }
    void finger(){
        System.out.println("I have Back side finger");
    }

}
class samsung extends mobile{

    @Override
    void camera() {
        System.out.println("samsung have 128 mega pixel camera");
    }

    @Override
    void display() {
        System.out.println("Samsung have 6.5 inch display");
    }
    void screen(){
        System.out.println("Samsung have curve radious display");
    }

}
public class abstract_oop {
    public static void main(String[] args) {
        samsung m32=new samsung();
        m32.callfun();
        m32.camera();
        m32.display();
        m32.screen();
        
        System.out.println("*-*-*-*-*-*-*-*---*-*--*-*-*--*");
        nokia c11=new nokia();
        c11.callfun();;
        c11.camera();
        c11.display();
        c11.finger();
    }
}
