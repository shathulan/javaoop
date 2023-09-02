
interface player{
    void playmusic();
    void stopmusic();
    void pauesemusic();
}
interface camera{
    void zoomin();
    void zooout();
}
class mobile{
    void call(){
        System.out.println("I have call option");
    }
    void sms(  ){
        System.out.println("i have sms");
    }
}
class motorla extends mobile implements player,camera{

    @Override
    public void zoomin() {
         System.out.println("i have zoomin option");
    }

    @Override
    public void zooout() {
       System.out.println("i have zoomout option");
    }

    @Override
    public void playmusic() {
    System.out.println("i have play music option");
    }

    @Override
    public void stopmusic() {
       System.out.println("i have stopmusic option");
    }

    @Override
    public void pauesemusic() {
        System.out.println("i have pausemusic option");
    }

}



//implements interfaces---- multilevel inheritance

public class interface_java {
    public static void main(String[] args) {
        motorla mo=new motorla();
            System.out.println("***********************extends mobile class");
        mo.call();
        mo.sms();
            System.out.println("***********************Music interface");
        mo.playmusic();
        mo.pauesemusic();
    
        mo.stopmusic();
            System.out.println("***********************Camera interface");
        mo.zoomin();
        mo.zooout();
        
    }
}
