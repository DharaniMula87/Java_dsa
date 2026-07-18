//Swap two numbers using a third variable swap
class swap
{
    public static void main(String[] args)
    {
        int m=18;
        int n=4;
        int temp=0;
        System.out.println("Before Swapping: ");
        System.out.println("m= "+m+"\nn= "+n);
        temp=m;
        m=n;
        n=temp;
        System.out.println("");
        System.out.println("After Swapping: ");
        System.out.println("m= "+m+"\nn= "+n);

    }
}