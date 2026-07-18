//Temperature conversion
class tempconversion
{
    public static void main(String[] args)
    {
        double fahrenheit=45;
        double celsius=(fahrenheit-32)*5/9;
        System.out.println("Fahrenheit to celcius Temprature is "+celsius);

        double cel=75;
        double fa=(celsius*9/5)+32;
        System.out.println("Celcius to Fahrenheit Temprature is "+fa);
    }
}