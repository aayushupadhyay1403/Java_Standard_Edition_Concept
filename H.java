class H{
    {
        int a = 20;
    }

    public static void main(String[] args){
        H x = new H();

        System.out.println(x.a);//local variables of local block are not accessible outside it.
    }
}
// H.java:9: error: cannot find symbol
//         System.out.println(x.a);
//                             ^
//   symbol:   variable a
//   location: variable x of type H
// 1 error