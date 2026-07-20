//Overflow demonstration
/*Overflow happens when a value exceeds the maximum limit of a data type. 
Java wraps the value around to the minimum value instead of throwing an error.
ex: A byte uses 8 bits, so it can represent only 256 different values.
After reaching the largest value (127), there is no larger value available,
so it wraps back to the smallest value (-128).
*/
class overflow
{
    public static void main(String[] args)
    {
        byte b = 127;
        b++;
        System.out.println(b);
    }
}