public class prepost 
{
    public static void main(String[] args)
    {
    int a=12;
    int b=25;
    System.out.println("a value before operations "+ a);
    System.out.println("b value before operations "+ b);
    int r1=a++;
    int r2=++a;
    
    int r3=b--;
    int r4=--b;
    System.out.println("Increment operators: ");
    System.out.println("a value after operations "+ a);
    System.out.println("a++ : "+r1);
    System.out.println("++a : "+r2);

    System.out.println("Decrement operators: ");
    System.out.println("b value after operations "+ b);
    System.out.println("b-- : "+r3);
    System.out.println("--b : "+r4);
    }
}