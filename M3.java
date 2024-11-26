class Circle{
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 10;

        Circle c2 =new Circle();
        c2.radius = 20;

        System.out.println(c1.pi);
        System.out.println(c2.pi);
    }
}