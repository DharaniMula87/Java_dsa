//Display min/max values of primitive types
/**
 * MIN_VALUE, and MAX_VALUE is present in wrapper classes
 * we write the Integer.MIN_VALUE because it use wrapper classes.
 * boolean is the only primitive type that does not have MIN_VALUE or MAX_VALUE because it doesn't represent a range of numbers.
 * prints the Unicode character \uFFFF, which is also not a printable character in most consoles.
 * Float.MIN_VALUE and Double.MIN_VALUE are not the most negative numbers. They are the smallest positive values greater than zero.
 */
class minmaxprimitive
{
    public static void main(String[] args)
    {
        System.out.println("Minimum values of primitive types byte,short,int,long,float,double,char");
        System.out.println("byte : "+Byte.MIN_VALUE);
        System.out.println("short : "+Short.MIN_VALUE);
        System.out.println("int : "+Integer.MIN_VALUE);
        System.out.println("long : "+Long.MIN_VALUE);
        System.out.println("float : "+Float.MIN_VALUE);
        System.out.println("double : "+Double.MIN_VALUE);
        System.out.println("char : "+Character.MIN_VALUE);   //'\u0000' (0)
        System.out.println("");
        System.out.println("Maximun values of primitive types byte,short,int,long,float,double,char");
        System.out.println("byte : "+Byte.MAX_VALUE);
        System.out.println("short : "+Short.MAX_VALUE);
        System.out.println("int : "+Integer.MAX_VALUE);
        System.out.println("long : "+Long.MAX_VALUE);
        System.out.println("float : "+Float.MAX_VALUE);
        System.out.println("double : "+Double.MAX_VALUE);
        System.out.println("char : "+Character.MAX_VALUE);   //'\uFFFF' (65535)
    }
}