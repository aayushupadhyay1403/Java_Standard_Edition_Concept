package a.b.c;
import x.y.B;

class A{
    public static void main(String[] args){
        B x;
    }
}

// a\b\c\A.java:2: error: B is not public in x.y; cannot be accessed from outside package
// import x.y.B;
//           ^
// a\b\c\A.java:6: error: B is not public in x.y; cannot be accessed from outside package
//         B x;
//         ^
// 2 errors