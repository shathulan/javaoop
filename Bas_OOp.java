
class oopbas {
    int length;
    int width;

    public void getdata(int a, int b) {
        length = a;
        width = b;
    }

    int area() {
        int c = length * width;
        return c;
    }
}

public class Bas_OOp {
    public static void main(String[] args) {
        oopbas oop = new oopbas();
        oop.length = 25;
        oop.width = 5;
        int ar = oop.area();
        System.out.println(ar);
    }
}
