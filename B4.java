class B4{
    int x = 10;

    public static void main(String[] args){
        System.out.println(B.x);
    }
}

// B.java:5: error: non-static variable x cannot be referenced from a static context
//         System.out.println(B.x);
//                             ^
// 1 error