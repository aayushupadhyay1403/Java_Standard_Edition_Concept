class Student{
    static String name;
    static int age;

    public static void main(String[] args){
        Student x = new Student();
        x.name = "mohan";
        x.age = 15;

        Student y = new Student();
        y.name = "manish";
        y.age = 17;

        Student z = new Student();
        z.name = "sohan";
        z.age = 20;

        System.out.println(x.name);
        System.out.println(y.age);
    }
}