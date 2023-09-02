class mobile {
    int Imei;
    boolean Fourthgen;
    int Simtray;
    mobile() {
    }
    mobile(int imei, boolean fourthgen, int simtray) {
        this.Imei = imei;
        this.Fourthgen = fourthgen;
        this.Simtray = simtray;
    }
    void display(){
        System.out.println("Imei No of Mobile \t"+Imei);
        System.out.println("is fourthgen \t"+Fourthgen);
        System.out.println("No of Sim tray is \t"+Simtray);
    }
}
class nokia extends mobile {
    double displaysize;
    int batterycapacity;

    public nokia(double displaysize, int batterycapacity) {
        this.displaysize = displaysize;
        this.batterycapacity = batterycapacity;
    }

    public nokia(int imei, boolean fourthgen, int simtray, double displaysize, int batterycapacity) {
        super(imei, fourthgen, simtray);
        this.displaysize = displaysize;
        this.batterycapacity = batterycapacity;
    }
    void display(){
        System.out.println("Imei No of Mobile : \t"+Imei);
        System.out.println("is fourthgen      :\t\t"+Fourthgen);
        System.out.println("No of Sim tray is :\t\t"+Simtray);
        System.out.println("*************************************************");
        System.out.println("Display size is    : \t"+displaysize);
        System.out.println("Battery capacity is :\t"+batterycapacity+"mah");
    }
}
public class priyansir_java {
    public static void main(String[] args) {
        nokia c11=new nokia(111258425, true, 2, 5.5, 5000);
        c11.display();
    }
}
