class F5(a){
    public static void main(String[] args){
        System.out.println(F1.x);
    }
}

class U{
    static boolean x = true;
}

// F5(a).java:3: error: cannot find symbol
//         System.out.println(F1.x);
//                              ^
//   symbol:   variable x
//   location: class F1
// 1 error