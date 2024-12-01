class H5{
    public static void main(String[] args){
        H h = new H();
        h.pro();
    }
}

class T{
    void pro(){
        System.out.println("Hello Doston...");
    }
}

// H.java:4: error: cannot find symbol
//         h.pro();
//          ^
//   symbol:   method pro()
//   location: variable h of type H
// 1 error