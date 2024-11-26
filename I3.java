class Circle{
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 10;

        Circle c2 = new Circle();
        c2.radius = 20;

        defineCircle();
    }

    void calcArea(){
        System.out.println(pi * radius * radius);
    }

    static float getPI(){
        return pi;
    }

    void defineCircle(){
        System.out.println("Circle is a ....");
    }
}

// I.java:12: error: non-static method defineCircle() cannot be referenced from a static context
//         defineCircle();
//         ^
// 1 error