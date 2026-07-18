//Compound Interest
class compoundint
{
    public static void main(String[] args)
    {
        double principal=30000;
        double rate=3;
        double time=1;
        double ci=principal*(Math.pow((1+rate/100),time))-principal;
        System.out.println("Compound Interest is "+ci);
    }
}