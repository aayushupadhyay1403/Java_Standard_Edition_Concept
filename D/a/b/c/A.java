package a.b.c;
import x.y.B;

class A{
    public static void main(String[] args){
        B x = new B();

        x.pro();
    }
}

// a\b\c\A.java:8: error: pro() is not public in B; cannot be accessed from outside package
//         x.pro();
//          ^
// 1 error