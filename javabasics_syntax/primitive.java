//Declare variables of every primitive type

/**
 * The primitive types are 8.
 * those are: 
 * 1)Byte: It stores the very small whole number.      ex:students count in small group
 * 2)short: It stores the small whole number which is bigger than the byte.        ex:roll numbers
 * 3)int: It stores the whole number which is bigger than the short.        ex:age,marks
 * 4)long: It stores the large whole number.           ex:people count in a country, phone numbers
 * 5)float: It stores the decimal numbers which is less precise than double         ex:temperature, weight
 * 6)double: It stores the high precision decimal numbers.           ex:bank balance,scientific calucations
 * 7)char: It stores one letter in it            ex:A,B,C
 * 8)boolean: It stores two values true, and false  ex:student:true
 */
class primitive
{
    public static void main(String[] args)
    {
        byte b=1;
        short s=8;
        int n=184;
        long l=123445677;
        float f=29.5f;
        double d=542.87789444;
        char c='D';
        boolean i=true;
        System.out.println("byte value: "+ b);
        System.out.println("short value: "+ s);
        System.out.println("int value: "+ n);
        System.out.println("long value: "+ l);
        System.out.println("float value: "+ f);
        System.out.println("double value: "+ d);
        System.out.println("character value: "+ c);
        System.out.println("boolean value: "+ i);
    }
}