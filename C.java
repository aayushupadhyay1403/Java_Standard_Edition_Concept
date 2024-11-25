
class C{

    void abc(){
        while(true){
            char g = '#';
            System.out.println(g);
        }
        System.out.println(g);//local variable of any block are not accessible outside that block.
    }

    public static void main(String[] args){
        C x = new C();

        x.abc();
    }
}
// C.java:7: error: cannot find symbol
//         System.out.println(g);
//                            ^
//   symbol:   variable g
//   location: class C
// 1 error


