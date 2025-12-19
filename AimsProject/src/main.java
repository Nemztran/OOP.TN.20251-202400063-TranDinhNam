class Test{
    public static void main (String args[]) {
        MyValue v1 = new MyValue(1);
        MyValue v2 = new MyValue(2);
        MyValue v3 = new MyValue(2);
        if (v1.equals(v2)) System.out.println("v1 bằng v2");
        else System.out.println("v1 khác v2");
        if (v2.equals(v3)) System.out.println("v2 bằng v3");
        else System.out.println("v2 khác v3");
    }
}