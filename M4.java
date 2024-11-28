class M4{
    static int w = 90;

    public static void main(String[] args){
        M m = new M();
        
        //Internally automatically this mechanism works.
        //<object-reference-variable>.<static-member>
        //m.w -> M.w

        System.out.println(m.w);
    }
}