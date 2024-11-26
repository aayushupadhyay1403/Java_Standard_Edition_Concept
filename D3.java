class Circle{
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 10;

        Circle c2 = new Circle();
        c2.radius = 20;

        calcArea();
    }

    void calcArea(){
        System.out.println(pi * radius * radius);
    }
}

// D.java:12: error: non-static method calcArea() cannot be referenced from a static context
//         calcArea();
//         ^
// 1 error