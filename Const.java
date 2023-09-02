class box {
    int Length, Width;

    box() {
        Length = 4;
        Width = 3;

    }

    box(int a, int b) {
        Length = a;
        Width = b;

    }

    box(int c) {
        Width = Length = c;
    }

    // same nameof class name
    // no return type
    // Public and Default only
    //initiate new key in the calling method
    // constroctor Overloading
    void area() {
        int a = Length * Width;
        System.out.println(a);
    }

}

public class Const {
    public static void main(String[] args) {
        box bo = new box();
        bo.area();
        box b1 = new box(5, 5);
        b1.area();
        box c = new box(59);
        c.area();
    }
}
