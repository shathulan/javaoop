class father{
    int car;
    double land;

    public father(int car, double land) {
        this.car = car;
        this.land = land;
    }
    father(){}
    
}

class son extends father{
    int haslaptop;
    int mobile;
    public son(int car, double land, int haslaptop, int mobile) {
        super(car, land);
        this.haslaptop = haslaptop;
        this.mobile = mobile;
    }
    public son() {     
    }
    void displaydata(){
        System.out.println("Father Has No of cars "+ car);
        System.out.println("Father Has Land "+ land+ "Acres");
        
        System.out.println("Son Has No of lap "+ haslaptop);
        System.out.println("son has mobile "+ mobile);
    }
    
}

public class inheritanceBasic {
    public static void main(String[] args) {
        son son= new son(1,250,1,1);
        son.displaydata();


    }
}
