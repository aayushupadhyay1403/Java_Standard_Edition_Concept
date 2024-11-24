//In java we can not assign any other values like char,int,float etc in boolean data type we can only assign the compatible values like "true" and "false".
class D{
    public static void main(String[] args){
        boolean b = true;

        System.out.println(b);

        // b = 0;

        // System.out.println(b);.java:8: error: incompatible types: int cannot be converted to boolean
        // b = 0;
        //     ^
        // 1 error

        //if(1){
        //System.out.println("Hello");// error: incompatible types: int cannot be converted to boolean
        //         if(1){
       //            ^
      // 1 error
     //         }
    }
}