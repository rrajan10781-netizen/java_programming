public class Unary
{
    public static void main(String[] args)
    {
        int a = 10;

        System.out.println("a = " + a);

        System.out.println("++a = " + (++a));
        System.out.println("a++ = " + (a++));
        System.out.println("After a++ = " + a);

        System.out.println("--a = " + (--a));
        System.out.println("a-- = " + (a--));
        System.out.println("After a-- = " + a);
    }
}