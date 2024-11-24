//Character Constant(Char)
//We can assign upper case,lower case,special character,numbers,escape characters and unicode number which falls under the range of 0-65535.
class E{
    public static void main(String[] args){
        char c = 'A';
        char c = 's';
        char c = '7';
        char c = '$';

        // char c = 'ab';//not allowed more than one character

        // char c = '''; //not allowed

        char c = '\'';

        // char c = '\';//not allowed

        char c = '\u8945';//0-65535
    }
}