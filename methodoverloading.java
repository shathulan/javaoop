
class mathsop {
    public int multiply(int a, int b) {
        return a * b;
    }

    public  double multiply(double x, double y) {
        return x * y;
    }

    public  double multiply(int a, double b) {
        return a * b;
    }
}
//method overloading 
public class methodoverloading {
    public static void main(String[] args) {
        mathsop aop = new mathsop();
        System.out.println(aop.multiply(5, 4));
        System.out.println(aop.multiply(5.4, 4.8));
        System.out.println(aop.multiply(5, 4.6));

    }
}
