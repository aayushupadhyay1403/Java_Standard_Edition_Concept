class Student{
    String name;
    int age;

    static int maxAge = 20;

    public static void main(String[] args){
        Student x = new Student();
        x.name = "om";
        x.age = 12;

        Student y = new Student();
        y.name = "ram";
        y.age = 15;

        x.showInfo();
    }

    void showInfo(){
        System.out.println(name);
    }
}