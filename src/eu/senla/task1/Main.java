package eu.senla.task1;

public class Main {
    static byte a=3;
    static int c=7;
    static short b=4;
    static double d=4.5;
    static String ff = "abba";



    public static void main(String[] args)
    {

        Operations operation = new Operations();
        operation.setA((byte)10);
        System.out.println(operation.getA());
        operation.setB(b);
        short bb = operation.getB();
        System.out.println(bb);
        c = (int) d;
        byte dd = (byte) c;
        long ddd = (long) dd;
        operation.setC(ddd);
        System.out.println(operation.getC());



        Integer i = 10;
        Integer in = new Integer(10);

        int c = 5;
        byte f = (byte) c;
        System.out.println(c);
        System.out.println(f);

        String e = "Senla";
        String ee = new String("Senla");
        Character z = new Character('C');
        Character zz = 58;
        System.out.println(zz);
        System.out.println(z);
        System.out.println(e);
        Boolean bool = false;
        System.out.println(bool);

        operation.setF(e);
        System.out.println(operation.getE());
        ff = e;
        operation.setF(ff);
        System.out.println(operation.getE());









    }



}
