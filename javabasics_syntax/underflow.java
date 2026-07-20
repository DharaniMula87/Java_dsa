//Underflow demonstration
/*
Underflow occurs when a value becomes smaller than the minimum value that a data type can store.
Java wraps around to the maximum value.
ex: The smallest value a byte can store is -128.
When you subtract 1, Java wraps around to the largest value, 127.
 */
class underflow
{
    public static void main(String[] args)
    {
        byte b=-128;
        b--;
        System.out.println(b);
    }
}