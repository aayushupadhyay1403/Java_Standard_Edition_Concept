class L4{
    String nm = "om";

    public static void main(String[] args){
        L x = new L();

        x.pro();
    }

    void pro(){
        System.out.println(x.nm);
    }
}

// L.java:11: error: cannot find symbol
//         System.out.println(x.nm);
//                            ^
//   symbol:   variable x
//   location: class L
// 1 error