class F4{
    int y = 90;

    public static void main(String[] args){
        showInfo();
    }

    void showInfo(){
        System.out.println(y);
    }
}

// F.java:5: error: non-static method showInfo() cannot be referenced from a static context
//         showInfo();
//         ^
// 1 error