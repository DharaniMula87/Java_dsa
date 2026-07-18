//Swap without third variable
/** 
 * There are two ways to swap the values without 3rd variable
 * 1)Addition and Substraction
 * 2)XOR(^)
 */

/* 1)With Addition and Substraction
class swapwithout
{
    public static void main(String[] args)
    {
        int a=15;
        int b=12;
        System.out.println("Before Swapping: ");
        System.out.println("a= "+a+"\nb= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("");
        System.out.println("After Swapping: ");
        System.out.println("a= "+a+"\nb= "+b);

    }
}*/


/*
A  B  A^B(XOR)
0  0  0
0  1  1
1  0  1
1  1  0


example:a=2;  b=5;
2=0010;   5=0101;
a=a^b ;               b=a^b;                 a=a^b;
a=0010(2)             a=0111(7)              a=0111(7)
b=0101(5)             b=0101(5)              b=0010(2)
-----------           ------------           -----------
a=0111(7)             b=0010(2)              a=0101(5)

After this step the a and b are swapped;

*/


class swapwithout
{
    public static void main(String[] args)
    {
        int a=9;
        int b=4;
        System.out.println("Before Swapping: ");
        System.out.println("a= "+a+"\nb= "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("");
        System.out.println("After Swapping: ");
        System.out.println("a= "+a+"\nb= "+b);
    }
}
