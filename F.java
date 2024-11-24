//we can assign any integer value in char within the the range of 0-65535
//ascii chart
class F{
    public static void main(String[] args){
        for(int i = 0;i < 256;i++){
            System.out.println((char)i + "\t" + i);
        }
    }
}