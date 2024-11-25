class D{
    void abc(){
        if(12 < 13){
            System.out.println(t * 2);//variable can not be accessed before declaration.
        }
        float t = 1.4f;
    }

    public static void main(String[] args){
        D x = new D();

        x.abc();
    }
}
// D.java:4: error: cannot find symbol
//             System.out.println(t * 2);
//                                ^
//   symbol:   variable t
//   location: class D
// 1 error

