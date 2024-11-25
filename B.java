 
class B{
    void abc(){
        int a = 20;
        for(int i=0; i<a; i++){
            System.out.println(a-i);
        }
    }

    public static void main(String[] args){
        B x = new B();

        x.abc();
    }

    

}